package com.products.prices.repositories;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.products.prices.models.Price;

public interface PriceRepository extends JpaRepository<Price, Long> {

    
    @Query("SELECT price FROM Price price " +
           "WHERE :actualDate BETWEEN price.startDate AND price.endDate " +
           "AND price.productId = :productId " +
           "AND price.brandId = :brandId")
    List<Price> findFilteredPrices(Timestamp actualDate, Long productId, Long brandId);

}

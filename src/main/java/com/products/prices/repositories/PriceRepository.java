package com.products.prices.repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;

import com.products.prices.models.Price;


public interface PriceRepository extends JpaRepository<Price, Long>{
    // @Query("")
    public List<Price> getFilteredPrices(Date actualDate, Long productId, Long brandId);
}

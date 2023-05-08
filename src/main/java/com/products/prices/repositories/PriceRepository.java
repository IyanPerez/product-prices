package com.products.prices.repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.products.prices.models.Price;

public interface PriceRepository extends JpaRepository<Price, Long> {
    List<Price> findByStartDateAndProductIdAndBrandId(Date startDate, Long productId, Long brandId);

}

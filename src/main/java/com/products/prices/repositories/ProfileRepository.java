package com.products.prices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.products.prices.models.Price;

public interface ProfileRepository extends JpaRepository<Price, Long>{
    
}

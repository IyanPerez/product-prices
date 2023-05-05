package com.products.prices.services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.prices.models.Price;
import com.products.prices.repositories.PriceRepository;

@Service

public class PriceService {
    
    @Autowired
    private PriceRepository priceRepository;

    public List<Price> getAll(){
        return priceRepository.findAll();
    }
    
    public List<Price> getQuery(Date actualDate, Long productId, Long brandId){


        return priceRepository.getFilteredPrices(actualDate, productId, brandId);
    }

    
}
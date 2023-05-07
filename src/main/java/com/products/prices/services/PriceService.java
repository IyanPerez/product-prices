package com.products.prices.services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.prices.models.Price;
import com.products.prices.models.PriceQueryRequest;
import com.products.prices.repositories.PriceRepository;

@Service

public class PriceService {
    
    @Autowired
    private PriceRepository priceRepository;

    public List<Price> getAll(){

        return priceRepository.findAll();
        
    }
    
    public List<Price> getQuery(PriceQueryRequest queryRequest){ 
        Date actualDate = queryRequest.getActualDate();
        Long productId = queryRequest.getProductId();
        Long brandId = queryRequest.getBrandId();
        return priceRepository.findByStartDateLessThanEqualAndEndDateGreaterThanEqualAndProductIdAndBrandIdOrderByPriorityDesc(actualDate, productId, brandId, actualDate); 
    }
    

    
}

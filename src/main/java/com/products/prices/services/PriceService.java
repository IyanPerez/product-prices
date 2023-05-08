package com.products.prices.services;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.prices.models.Price;
import com.products.prices.payloads.PriceQueryRequest;
import com.products.prices.repositories.PriceRepository;

@Service

public class PriceService {

    @Autowired
    private PriceRepository priceRepository;

    public List<Price> getAll() {

        return priceRepository.findAll();

    }

    public List<Price> sendQuery(PriceQueryRequest queryRequest) {
        Timestamp actualDate = queryRequest.getActualDate();
        Long productId = queryRequest.getProductId();
        Long brandId = queryRequest.getBrandId();
        return priceRepository.findFilteredPrices(actualDate, productId, brandId);
    }

}

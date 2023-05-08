package com.products.prices.services;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.prices.dto.PriceDto;
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

    public List<PriceDto> getFilterdPrices(PriceQueryRequest queryRequest) {

        Timestamp actualDate = queryRequest.getActualDate();
        Long productId = queryRequest.getProductId();
        Long brandId = queryRequest.getBrandId();

        List<Price> prices = priceRepository.findFilteredPrices(actualDate, productId, brandId);

        List<PriceDto> pricesDtos = new ArrayList<>();

        for (Price price : prices) {

            PriceDto priceDto = new PriceDto();

            priceDto.setProductId(price.getProductId());
            priceDto.setBrandId(price.getBrandId());
            priceDto.setPriceList(price.getPriceList());
            priceDto.setStartDate(price.getStartDate());
            priceDto.setEndDate(price.getEndDate());
            priceDto.setPrice(price.getPrice());
            
            pricesDtos.add(priceDto);
        }
    
        return pricesDtos;
    }

}

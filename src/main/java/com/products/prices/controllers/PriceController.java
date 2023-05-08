package com.products.prices.controllers;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.prices.models.Price;
import com.products.prices.payloads.PriceQueryRequest;
import com.products.prices.services.PriceService;

@RestController
@RequestMapping(path = "/api/prices")
public class PriceController {

    @Autowired
    private PriceService priceService;

    @GetMapping(path = "")
    public List<Price> getPrices() {
        return priceService.getAll();
    }

    @GetMapping(path = "/query/{actualDate}/{productId}/{brandId}")
    public List<Price> getFilteredPrices(
        @PathVariable("actualDate") Timestamp actualDate,
        @PathVariable("productId") Long productId,
        @PathVariable("brandId") Long brandId) {
        PriceQueryRequest queryRequest = new PriceQueryRequest(actualDate, productId, brandId);
        return priceService.sendQuery(queryRequest);
    }

}

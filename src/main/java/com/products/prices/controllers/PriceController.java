package com.products.prices.controllers;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.prices.models.Price;
import com.products.prices.services.PriceService;


@RestController
@RequestMapping(path = "/api/prices")
public class PriceController {

    @Autowired
    private PriceService priceService;

    @GetMapping(path = "")
    public List<Price> getPrice(){
        return priceService.getAll();
    }

    @GetMapping(path = "/query/{actualDate}/{productId}/{brandId}")
    public List<Price> getQuery(@PathVariable Date actualDate, @PathVariable Long productId, @PathVariable Long brandId){
    return priceService.getQuery(actualDate, productId, brandId);
    }


}

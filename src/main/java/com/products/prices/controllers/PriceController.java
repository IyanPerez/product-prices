package com.products.prices.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.prices.models.Price;
import com.products.prices.services.PriceService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/prices")
public class PriceController {
    private PriceService priceService;

    @GetMapping(path = "")
    public List<Price> getPrice(){
        return priceService.getAll();
    }



}

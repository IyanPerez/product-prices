package com.products.prices.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.products.prices.models.Price;
import com.products.prices.repositories.ProfileRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PriceService {
    
    private ProfileRepository profileRepository;

    public List<Price> getAll(){
        return profileRepository.findAll();
    }
    
}

package com.products.prices.models;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PriceQueryRequest {
    private Date actualDate;
    private Long productId;
    private Long brandId;
    
}

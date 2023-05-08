package com.products.prices.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor 
@NoArgsConstructor
public class PriceDto {

    private Long productId;
    private Long brandId;
    private Long priceList;
    private Timestamp startDate;
    private Timestamp endDate;
    private Float price;

    public Timestamp getStartDate() {
        return startDate;
    }
    public void setStartDate(Timestamp timestamp) {
        this.startDate = timestamp;
    }
    public Timestamp getEndDate() {
        return endDate;
    }
    public void setEndDate(Timestamp timestamp) {
        this.endDate = timestamp;
    }



}

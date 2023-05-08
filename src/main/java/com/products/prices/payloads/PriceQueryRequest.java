package com.products.prices.payloads;

import java.sql.Date;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PriceQueryRequest {
    @Temporal(TemporalType.DATE)
    private Date actualDate;
    private Long productId;
    private Long brandId;

}

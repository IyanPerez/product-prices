package com.products.prices.payloads;

import java.sql.Timestamp;

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
    private Timestamp actualDate;
    private Long productId;
    private Long brandId;

}

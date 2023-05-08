package com.products.prices;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.products.prices.dto.PriceDto;


import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
class PriceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getQueryFilterPrices() throws Exception {

		// <--------------This test is still in progress---------------->


        // Params for the query
        String actualDate ="2023-05-08 10:00:00";
        Long productId = Long.valueOf(35455);
        Long brandId = Long.valueOf(1);

        // Make the HTTP request
		MvcResult result = mockMvc.perform(getRequestBuilder(actualDate, productId, brandId))
		.andExpect(status().isOk()) // Validar que la respuesta es OK (200)
		.andReturn();

        // Obtain price list on response
        ObjectMapper objectMapper = new ObjectMapper();
        List<PriceDto> prices = objectMapper.readValue(result.getResponse().getContentAsString(),
            new TypeReference<List<PriceDto>>() {});

        // Validate that the prices list is not null
        assertThat(prices).isNotNull();

        // Validate that the prices have the expected values(missing values: dates, priceList; priceValue needs to be compared with the recieved values from the response)
        for (PriceDto price : prices) {
            assertThat(price.getBrandId()).isEqualTo(brandId);
            assertThat(price.getProductId()).isEqualTo(productId);
			assertThat(price.getPriceValue()).isNotNull();
        }
    }

	private RequestBuilder getRequestBuilder(String actualDate, Long productId, Long brandId) {
		return MockMvcRequestBuilders.get("/api/prices/query/{actualDate}/{productId}/{brandId}", actualDate, productId, brandId)
			.contentType(MediaType.APPLICATION_JSON);
	}
	
}


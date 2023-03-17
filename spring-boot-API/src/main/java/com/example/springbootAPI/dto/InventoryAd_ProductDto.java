package com.example.springbootAPI.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InventoryAd_ProductDto {

    private int product_id;
    private String category_id;
    private String product_brand;
    private String product_name;
    private double product_price;
    private int product_quantity;
}

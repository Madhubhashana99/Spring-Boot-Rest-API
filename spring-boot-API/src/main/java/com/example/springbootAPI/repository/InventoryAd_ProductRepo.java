package com.example.springbootAPI.repository;

import com.example.springbootAPI.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryAd_ProductRepo extends JpaRepository<Product, Integer> {

}

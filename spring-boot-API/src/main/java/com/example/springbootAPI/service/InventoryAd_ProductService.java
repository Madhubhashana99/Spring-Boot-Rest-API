package com.example.springbootAPI.service;

import com.example.springbootAPI.dto.InventoryAd_ProductDto;
import com.example.springbootAPI.model.Product;
import com.example.springbootAPI.repository.InventoryAd_ProductRepo;
import com.example.springbootAPI.util.VarList;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class InventoryAd_ProductService {

    @Autowired
    private InventoryAd_ProductRepo inventoryAd_productRepo;

    @Autowired
    private ModelMapper modelMapper;

    public String saveProduct(InventoryAd_ProductDto inventoryAd_productDto){
        //Check the data exist or not in the database
        if(inventoryAd_productRepo.existsById(inventoryAd_productDto.getProduct_id())){
            return VarList.RSP_DUPLICATED;
        }else{
            inventoryAd_productRepo.save(modelMapper.map(inventoryAd_productDto, Product.class));
            return VarList.RSP_SUCCESS;
        }

    }

    //Update product in database
    public String updateProduct(InventoryAd_ProductDto inventoryAd_productDto){
        //Check the product exist or not
        if(inventoryAd_productRepo.existsById(inventoryAd_productDto.getProduct_id())){
            inventoryAd_productRepo.save(modelMapper.map(inventoryAd_productDto, Product.class));
            return VarList.RSP_SUCCESS;
        }else{
            return VarList.RSP_NO_DATA_FOUND;
        }
    }
}

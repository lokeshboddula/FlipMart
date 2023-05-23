package com.example.FlipMart.service;

import com.example.FlipMart.DTO.requestDTO.ProductRequestDTO;
import com.example.FlipMart.DTO.responseDTO.ProductResponseDTO;
import com.example.FlipMart.Enum.Category;
import com.example.FlipMart.exception.SellerNotFoundException;

import java.util.List;

public interface ProductService {
    public ProductResponseDTO addProduct(ProductRequestDTO requestDTO) throws SellerNotFoundException;

    List<ProductResponseDTO> getProductsByCategoryAndPrice(Category category, int price);
}

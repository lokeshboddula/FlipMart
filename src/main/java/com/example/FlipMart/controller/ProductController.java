package com.example.FlipMart.controller;

import com.example.FlipMart.DTO.requestDTO.ProductRequestDTO;
import com.example.FlipMart.DTO.responseDTO.ProductResponseDTO;
import com.example.FlipMart.Enum.Category;
import com.example.FlipMart.exception.SellerNotFoundException;
import com.example.FlipMart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("/add")
    public ResponseEntity addProduct(@RequestBody ProductRequestDTO productRequestDTO) {
        try {
            ProductResponseDTO productResponseDTO = productService.addProduct(productRequestDTO);
            return new ResponseEntity<>(productResponseDTO, HttpStatus.CREATED);

        } catch (SellerNotFoundException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/get/category/{category}/price/{price}")
    public ResponseEntity getProductsByCategoryAndPrice(@PathVariable Category category,
                                                        @PathVariable int price) {
        List<ProductResponseDTO> productResponseDTOS =
                                    productService.getProductsByCategoryAndPrice(category, price);
        return new ResponseEntity<>(productResponseDTOS, HttpStatus.ACCEPTED);
    }
}

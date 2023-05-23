package com.example.FlipMart.transformer;

import com.example.FlipMart.DTO.requestDTO.ProductRequestDTO;
import com.example.FlipMart.DTO.responseDTO.ProductResponseDTO;
import com.example.FlipMart.Enum.ProductStatus;
import com.example.FlipMart.model.Product;
import com.example.FlipMart.model.Seller;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ProductTransformer {
    public static Product ProductRequestDTOToProduct(ProductRequestDTO productRequestDTO) {
        return Product.builder()
                .name(productRequestDTO.getName())
                .price(productRequestDTO.getPrice())
                .quantity(productRequestDTO.getQuantity())
                .category(productRequestDTO.getCategory())
                .productStatus(ProductStatus.AVAILABLE)
                .build();
    }

    public static ProductResponseDTO ProductToProductResponseDTO(Product savedProduct) {
        return ProductResponseDTO.builder()
                .productName(savedProduct.getName())
                .sellerName(savedProduct.getSeller().getName())
                .category(savedProduct.getCategory())
                .price(savedProduct.getPrice())
                .productStatus(savedProduct.getProductStatus())
                .build();
    }
}

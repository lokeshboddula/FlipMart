package com.example.FlipMart.DTO.responseDTO;

import com.example.FlipMart.Enum.Category;
import com.example.FlipMart.Enum.ProductStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class ProductResponseDTO {
    String productName;
    String sellerName;
    Category category;
    int price;
    ProductStatus productStatus;
}

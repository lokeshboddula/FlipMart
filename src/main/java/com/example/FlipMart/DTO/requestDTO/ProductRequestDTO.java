package com.example.FlipMart.DTO.requestDTO;

import com.example.FlipMart.Enum.Category;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class ProductRequestDTO {

    String sellerEmailId;

    String name;

    Integer price;

    Category category;

    Integer quantity;

}

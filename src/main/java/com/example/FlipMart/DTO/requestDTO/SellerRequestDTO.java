package com.example.FlipMart.DTO.requestDTO;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class SellerRequestDTO {
    String name;

    String emailId;

    String mobNo;
}

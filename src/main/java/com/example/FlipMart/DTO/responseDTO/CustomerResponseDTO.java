package com.example.FlipMart.DTO.responseDTO;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class CustomerResponseDTO {
    String name;
    String emailId;
    String mobNo;
}

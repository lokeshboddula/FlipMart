package com.example.FlipMart.DTO.requestDTO;

import com.example.FlipMart.Enum.Gender;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class CustomerRequestDTO {

    String name;
    String emailId;
    String mobNo;
    Gender gender;
}

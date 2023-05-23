package com.example.FlipMart.transformer;

import com.example.FlipMart.DTO.requestDTO.SellerRequestDTO;
import com.example.FlipMart.DTO.responseDTO.SellerResponseDTO;
import com.example.FlipMart.model.Seller;
import lombok.experimental.UtilityClass;

@UtilityClass
public class SellerTransformer {
    public static Seller SellerRequestDTOTOSeller(SellerRequestDTO requestDTO){
        return Seller.builder()
                .name(requestDTO.getName())
                .emailId(requestDTO.getEmailId())
                .mobNo(requestDTO.getMobNo())
                .build();
    }

    public static SellerResponseDTO SellerTOSellerResponseDTO(Seller seller) {
        return SellerResponseDTO.builder()
                .name(seller.getName())
                .mobNo(seller.getMobNo())
                .build();
    }
}

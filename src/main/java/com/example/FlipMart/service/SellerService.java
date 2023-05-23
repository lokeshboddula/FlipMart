package com.example.FlipMart.service;

import com.example.FlipMart.DTO.requestDTO.SellerRequestDTO;
import com.example.FlipMart.DTO.responseDTO.SellerResponseDTO;

public interface SellerService {
    public SellerResponseDTO addSeller(SellerRequestDTO requestDTO);
}

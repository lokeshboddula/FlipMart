package com.example.FlipMart.service;

import com.example.FlipMart.DTO.requestDTO.CustomerRequestDTO;
import com.example.FlipMart.DTO.responseDTO.CustomerResponseDTO;

public interface CustomerService {
    CustomerResponseDTO addCustomer(CustomerRequestDTO customerRequestDTO);
}

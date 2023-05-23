package com.example.FlipMart.transformer;

import com.example.FlipMart.DTO.requestDTO.CustomerRequestDTO;
import com.example.FlipMart.DTO.responseDTO.CustomerResponseDTO;
import com.example.FlipMart.model.Customer;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CustomerTransformer {
    public Customer customerRequestDTOtoCustomer(CustomerRequestDTO customerRequestDTO) {
        return Customer.builder()
                .name(customerRequestDTO.getName())
                .mobNo(customerRequestDTO.getMobNo())
                .emailId(customerRequestDTO.getEmailId())
                .gender(customerRequestDTO.getGender())
                .build();
    }

    public static CustomerResponseDTO customerToCustomerResponseDTO(Customer savedCustomer) {
        return CustomerResponseDTO.builder()
                .name(savedCustomer.getName())
                .mobNo(savedCustomer.getMobNo())
                .emailId(savedCustomer.getEmailId())
                .build();
    }
}

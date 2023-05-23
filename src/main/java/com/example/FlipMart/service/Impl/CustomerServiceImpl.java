package com.example.FlipMart.service.Impl;

import com.example.FlipMart.DTO.requestDTO.CustomerRequestDTO;
import com.example.FlipMart.DTO.responseDTO.CustomerResponseDTO;
import com.example.FlipMart.model.Cart;
import com.example.FlipMart.model.Customer;
import com.example.FlipMart.respository.CustomerRepository;
import com.example.FlipMart.service.CustomerService;
import com.example.FlipMart.transformer.CustomerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public CustomerResponseDTO addCustomer(CustomerRequestDTO customerRequestDTO) {
        Customer customer = CustomerTransformer.customerRequestDTOtoCustomer(customerRequestDTO);
        Cart cart = Cart.builder()
                .customer(customer)
                .cartTotal(0)
                .build();

        customer.setCart(cart);

        Customer savedCustomer = customerRepository.save(customer); // saves customer and cart

        return  CustomerTransformer.customerToCustomerResponseDTO(savedCustomer);
    }
}

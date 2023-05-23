package com.example.FlipMart.controller;

import com.example.FlipMart.DTO.requestDTO.SellerRequestDTO;
import com.example.FlipMart.DTO.responseDTO.SellerResponseDTO;
import com.example.FlipMart.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    SellerService sellerService;
    @PostMapping("/add")
    public ResponseEntity addSeller(@RequestBody SellerRequestDTO requestDTO) {
        SellerResponseDTO responseDTO = sellerService.addSeller(requestDTO);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }
}

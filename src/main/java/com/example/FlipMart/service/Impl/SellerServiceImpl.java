package com.example.FlipMart.service.Impl;
import com.example.FlipMart.DTO.requestDTO.SellerRequestDTO;
import com.example.FlipMart.DTO.responseDTO.SellerResponseDTO;
import com.example.FlipMart.respository.SellerRepository;
import com.example.FlipMart.model.Seller;
import com.example.FlipMart.service.SellerService;
import com.example.FlipMart.transformer.SellerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService {
    @Autowired
    SellerRepository sellerRepository;
    public SellerResponseDTO addSeller(SellerRequestDTO requestDTO) {

        Seller seller = SellerTransformer.SellerRequestDTOTOSeller(requestDTO);

        Seller savedSeller = sellerRepository.save(seller);

        return SellerTransformer.SellerTOSellerResponseDTO(savedSeller);
    }
}

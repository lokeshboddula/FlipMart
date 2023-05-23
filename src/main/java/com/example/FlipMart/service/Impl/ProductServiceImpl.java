package com.example.FlipMart.service.Impl;

import com.example.FlipMart.DTO.requestDTO.ProductRequestDTO;
import com.example.FlipMart.DTO.responseDTO.ProductResponseDTO;
import com.example.FlipMart.Enum.Category;
import com.example.FlipMart.exception.SellerNotFoundException;
import com.example.FlipMart.model.Product;
import com.example.FlipMart.model.Seller;
import com.example.FlipMart.respository.ProductRepository;
import com.example.FlipMart.respository.SellerRepository;
import com.example.FlipMart.service.ProductService;
import com.example.FlipMart.transformer.ProductTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    SellerRepository sellerRepository;
    @Autowired
    ProductRepository productRepository;
    public ProductResponseDTO addProduct(ProductRequestDTO requestDTO) throws SellerNotFoundException {

        Seller seller = sellerRepository.findByEmailId(requestDTO.getSellerEmailId());
        if(seller == null) throw new SellerNotFoundException("Seller not found!, Email not registered");

        Product product = ProductTransformer.ProductRequestDTOToProduct(requestDTO);

        product.setSeller(seller);
        seller.getProducts().add(product);

        Seller savedSeller = sellerRepository.save(seller); // saves both seller and product
        Product savedProduct = savedSeller.getProducts().get(savedSeller.getProducts().size() - 1);
        return ProductTransformer.ProductToProductResponseDTO(savedProduct);
    }

    @Override
    public List<ProductResponseDTO> getProductsByCategoryAndPrice(Category category, int price) {
        List<Product> products = productRepository.findByCategoryAndPrice(category, price);
        List<ProductResponseDTO> responseDTOS = new ArrayList<>();
        for (Product p : products) {
            responseDTOS.add(ProductTransformer.ProductToProductResponseDTO(p));
        }
        return responseDTOS;
    }
}

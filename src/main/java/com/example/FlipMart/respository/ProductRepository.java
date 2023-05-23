package com.example.FlipMart.respository;

import com.example.FlipMart.Enum.Category;
import com.example.FlipMart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByCategoryAndPrice(Category category, int price);
}

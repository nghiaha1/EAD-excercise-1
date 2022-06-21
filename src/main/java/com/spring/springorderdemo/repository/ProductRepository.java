package com.spring.springorderdemo.repository;

import com.spring.springorderdemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}

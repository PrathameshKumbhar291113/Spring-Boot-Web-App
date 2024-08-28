package com.firstspringbootproject.firstspringbootproject.repository;

import com.firstspringbootproject.firstspringbootproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

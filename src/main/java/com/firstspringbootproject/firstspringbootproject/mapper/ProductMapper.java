package com.firstspringbootproject.firstspringbootproject.mapper;


import com.firstspringbootproject.firstspringbootproject.dto.CategoryDTO;
import com.firstspringbootproject.firstspringbootproject.dto.ProductDTO;
import com.firstspringbootproject.firstspringbootproject.model.Category;
import com.firstspringbootproject.firstspringbootproject.model.Product;
import org.springframework.stereotype.Component;

import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductDTO toDTO(Product product) {
        ProductDTO dto = new ProductDTO();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setPrice(product.getPrice());
        if (product.getCategory() != null) {
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setId(product.getCategory().getId());
            categoryDTO.setName(product.getCategory().getName());
            dto.setCategory(categoryDTO);
        }
        return dto;
    }

    public Product toEntity(ProductDTO dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        // Assume we have a method to find Category by ID
        Category category = new Category();
        category.setId(dto.getCategory().getId());
        product.setCategory(category);
        return product;
    }
}


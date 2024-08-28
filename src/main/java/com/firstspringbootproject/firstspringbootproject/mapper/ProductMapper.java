package com.firstspringbootproject.firstspringbootproject.mapper;


import com.firstspringbootproject.firstspringbootproject.dto.CategoryDTO;
import com.firstspringbootproject.firstspringbootproject.dto.ProductDTO;
import com.firstspringbootproject.firstspringbootproject.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductDTO toDTO(Product product) {
        if (product == null) {
            return null;
        }

        ProductDTO dto = new ProductDTO();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setPrice(product.getPrice());

        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(product.getCategory().getId());
        categoryDTO.setName(product.getCategory().getName());
        dto.setCategory(categoryDTO);

        return dto;
    }
}

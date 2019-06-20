package com.shop.mapper;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.shop.domain.Product;
import com.shop.domain.model.ProductDTO;

@Component
public class ProductEntityToDTOMapper implements Converter<Product, ProductDTO> {

    @Override
    public ProductDTO convert(Product source) {
        return ProductDTO.builder()
						 .id(source.getId())
                         .name(source.getName())
                         .type(source.getType().toString())
                         .price(source.getPrice().toString())
                         .stoc(source.getStoc().getStoc())
                         .build();
    }
}

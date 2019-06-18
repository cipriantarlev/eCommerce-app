package com.shop.service;

import java.util.List;

import com.shop.domain.enums.ProductType;
import com.shop.domain.model.ProductDTO;

public interface ProductService {

	void createProduct(ProductDTO product);

	List<ProductDTO> getAllProducts();

	List<ProductDTO> getProductByType(ProductType type);

	ProductDTO getProductById(String id);
}

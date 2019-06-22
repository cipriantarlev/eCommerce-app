package com.shop.service;

import java.util.List;

import com.shop.domain.Product;
import com.shop.domain.enums.ProductType;
import com.shop.domain.model.ProductDTO;

public interface ProductService {

	List<Product> getProductByType(ProductType type);

	void createProduct(ProductDTO product);

	List<ProductDTO> getAllProducts();

	List<ProductDTO> getProductsByType(ProductType type);

	ProductDTO getProductsById(String id);

	void deleteProductDTO(String id);

}

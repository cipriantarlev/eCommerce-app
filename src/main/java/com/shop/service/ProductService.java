package com.shop.service;

import java.util.List;

import com.shop.domain.Product;
import com.shop.domain.enums.ProductType;

public interface ProductService {
	List<Product> getProductsByType(ProductType type);

	List<Product> findAllProduct();

	Product findProductById(Long id);

	Product updateProduct(Product product);

	Product insertProduct(Product product);

	void deleteProductById(Long id);
}

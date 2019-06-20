package com.shop.service;

import java.util.List;

import com.shop.domain.Product;
import com.shop.domain.enums.ProductType;
import com.shop.domain.model.ProductDTO;

public interface ProductService {

	List<Product> getProductByType(ProductType type);

	List<Product> findAllProduct();

	Product findProductById(String id);

	Product updateProduct(Product product);

	Product insertProduct(Product product);

	void deleteProductById(String id);

	void createProduct(ProductDTO product);

	List<ProductDTO> getAllProducts();

	List<ProductDTO> getProductsByType(ProductType type);

	ProductDTO getProductsById(String id);

}

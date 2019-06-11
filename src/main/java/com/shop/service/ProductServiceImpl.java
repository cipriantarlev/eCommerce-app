package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.domain.Product;
import com.shop.domain.enums.ProductType;
import com.shop.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	@Override
	public List<Product> getProductsByType(ProductType type) {
		return productRepo.getProductsByType(type);
	}

	@Override
	public List<Product> findAllProduct() {
		return productRepo.findAll();
	}

	@Override
	public Product findProductById(Long id) {
		return productRepo.findById(id).get();
	}

	@Override
	public Product updateProduct(Product product) {
		return productRepo.save(product);
	}

	@Override
	public Product insertProduct(Product product) {
		return productRepo.save(product);
	}

	@Override
	public void deleteProductById(Long id) {
		productRepo.deleteById(id);
	}

}

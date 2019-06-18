package com.shop.domain.model;

import java.util.ArrayList;
import java.util.List;

import com.shop.service.ProductService;
import com.shop.service.ProductServiceImpl;

public class ProductModel {

	private List<ProductDTO> products;

	private ProductService service;

	public ProductModel() {
		this.products = new ArrayList<>();
		this.service = new ProductServiceImpl();
		for (ProductDTO productDTO : service.getAllProducts()) {
			products.add(productDTO);
		}
	}

	public List<ProductDTO> findAll() {
		return this.products;
	}

	public ProductDTO find(String id) {
		for (ProductDTO product : this.products) {
			if (product.getId().equalsIgnoreCase(id)) {
				return product;
			}
		}
		return null;
	}
}

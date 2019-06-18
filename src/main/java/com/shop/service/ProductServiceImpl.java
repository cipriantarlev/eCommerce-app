package com.shop.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.domain.Product;
import com.shop.domain.enums.ProductType;
import com.shop.domain.model.ProductDTO;
import com.shop.mapper.ProductDTOToEntityMapper;
import com.shop.mapper.ProductEntityToDTOMapper;
import com.shop.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	@Autowired
	private ProductDTOToEntityMapper productDTOToEntityMapper;

	@Autowired
	private ProductEntityToDTOMapper productEntityToDTOMapper;

	@Override
	public void createProduct(ProductDTO productDTO) {   //pe baza de constructor sau Product Mode
		Product product = productDTOToEntityMapper.convert(productDTO);
		productRepo.save(product);
	}

	@Override
	public List<ProductDTO> getAllProducts() {  //find all
		return productRepo.findAll()
						  .stream()
						  .map(productEntityToDTOMapper::convert)
						  .collect(Collectors.toList());
	}

	@Override
	public List<ProductDTO> getProductByType(ProductType type) { // product find by type
		return productRepo.getProductsByType(type)
						  .stream()
						  .map(productEntityToDTOMapper::convert)
						  .collect(Collectors.toList());
	}

	@Override
	public ProductDTO getProductById(String id) {
		return productEntityToDTOMapper.convert(productRepo.getProductsById(id)); // product find by id
	}

}

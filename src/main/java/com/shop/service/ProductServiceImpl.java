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

	private ProductDTO productDTO = new ProductDTO();

	@Autowired
	private ProductDTOToEntityMapper productDTOToEntityMapper;

	@Autowired
	private ProductEntityToDTOMapper productEntityToDTOMapper;

	@Override
	public List<Product> getProductByType(ProductType type) {
		return productRepo.getProductsByType(type);
	}

	@Override
	public List<Product> findAllProduct() {
		return productRepo.findAll();
	}

	@Override
	public Product findProductById(String id) {
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
	public void deleteProductById(String id) {
		productRepo.deleteById(id);
	}

	public void createProduct(ProductDTO productDTO) {
		Product product = productDTOToEntityMapper.convert(productDTO);
		productRepo.save(product);

	}

	@Override
	public List<ProductDTO> getAllProducts() {
		return productRepo.findAll()
						  .stream()
						  .map(productEntityToDTOMapper::convert)
						  .collect(Collectors.toList());
	}

	@Override
	public List<ProductDTO> getProductsByType(ProductType type) {
		return productRepo.getProductsByType(type)
						  .stream()
						  .map(productEntityToDTOMapper::convert)
						  .collect(Collectors.toList());
	}
	
	public ProductDTO getProductsById(String id) {
		return productRepo.findById(id)
						  .map(productEntityToDTOMapper::convert)
						  .get();
	}

	@Override
	public void deleteProductDTO(String id) {
		ProductDTO productDTO = this.getProductsById(id);
		Product product = productDTOToEntityMapper.convert(productDTO);
		productRepo.deleteById(product.getId());
	}
}

package com.shop.service;

import java.util.List;
import java.util.Optional;
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

//	@Transactional
//	public void updateProduct(String productId, ProductDTO productDTO) {
//		Optional<Product> optProduct = productRepo.findById(productId);
//		Product product;
//		if (optProduct.isPresent()) {
//			product = optProduct.get();
//		} else {
//			throw new RuntimeException("The id of the product is not in database!");
//		}
//		product.setName(productDTO.getName());
//		product.setType(ProductType.valueOf(productDTO.getType()));
//		product.setPrice(new BigDecimal(productDTO.getPrice()));
//		product.setStoc(Stoc.builder().stoc(productDTO.getStoc()).build());
//
////		
////		Product product = productDTOToEntityMapper.convert(productDTO);
////		Product savedProduct = productRepo.save(product);
////
////		return productEntityToDTOMapper.convert(product);
//	}

	public ProductDTO getProductsById(String id) {
		Optional<ProductDTO> optProductDTO = productRepo.findById(id).map(productEntityToDTOMapper::convert);
		if (optProductDTO.isPresent()) {
			return optProductDTO.get();
		} else {
			throw new RuntimeException("The id of the product is not in database!");
		}
	}

	public void createProduct(ProductDTO productDTO) {
		Product product = productDTOToEntityMapper.convert(productDTO);
		productRepo.save(product);
	}

	@Override
	public List<ProductDTO> getAllProducts() {
		return productRepo.findAll().stream().map(productEntityToDTOMapper::convert).collect(Collectors.toList());
	}

	@Override
	public List<ProductDTO> getProductsByType(ProductType type) {
		return productRepo.getProductsByType(type).stream().map(productEntityToDTOMapper::convert)
				.collect(Collectors.toList());
	}


	@Override
	public void deleteProductDTO(String id) {
		ProductDTO productDTO = this.getProductsById(id);
		Product product = productDTOToEntityMapper.convert(productDTO);
		productRepo.deleteById(product.getId());
	}
}

package com.shop.domain;


import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import com.shop.domain.enums.ProductType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Product {
	
	@Id
	private Long id;
	
	@Column(name = "name")
	private String productName;
	
	@Column(name = "type")
	@Enumerated(EnumType.STRING)
	private ProductType productType;
	
	private BigDecimal price;
	
	@Lob
	private byte[] image;
	
	@OneToOne
	@JoinColumn(name = "stoc_id")
	private Stoc stoc;

	public Product(Long id, String productName, ProductType productType, BigDecimal price, byte[] image, Stoc stoc) {
		super();
		this.id = id;
		this.productName = productName;
		this.productType = productType;
		this.price = price;
		this.image = image;
		this.stoc = stoc;
	}

	public Product(String productName, ProductType productType, BigDecimal price, byte[] image, Stoc stoc) {
		super();
		this.productName = productName;
		this.productType = productType;
		this.price = price;
		this.image = image;
		this.stoc = stoc;
	}
}

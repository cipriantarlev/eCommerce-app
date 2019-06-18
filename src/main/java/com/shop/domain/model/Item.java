package com.shop.domain.model;

public class Item {

	private ProductDTO product;
	private int quantity;

	public ProductDTO getProduct() {
		return product;
	}

	public void setProduct(ProductDTO product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Item() {
	}

	public Item(ProductDTO product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

}

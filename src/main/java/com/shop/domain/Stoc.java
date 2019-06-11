package com.shop.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Stoc {
	
	@Id
	private long id;
	
	private Integer stoc;
	
	@OneToOne(mappedBy="stoc")
	@JsonIgnore
	private Product prodcut;

	public Stoc(long id, Integer stoc) {
		super();
		this.id = id;
		this.stoc = stoc;
	}

	public Stoc(long id) {
		super();
		this.id = id;
	}
}

package com.shop.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Stoc {
	
	@Id
	private long id;
	
	private Integer stoc;
	
	@OneToOne(mappedBy="stoc")
	@JsonIgnore
	private Product prodcut;
}

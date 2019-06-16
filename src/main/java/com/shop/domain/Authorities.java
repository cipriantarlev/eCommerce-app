package com.shop.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "authorities")
public class Authorities {

	@Id
	private int id;
	@ManyToOne
	@JoinColumn(name = "username")
	private User user;


	private String authority;

	public Authorities(User user, String authority) {
		super();
		this.user = user;
		this.authority = authority;
	}

	public Authorities(User user) {
		super();
		this.user = user;
	}
}

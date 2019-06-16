package com.shop.service;

import java.util.List;

import com.shop.domain.Authorities;

public interface AuthoritiesService {
	List<Authorities> findAllAuthorities();

	Authorities findAuthorityById(int id);

	Authorities updateAuthority(Authorities authorities);

	Authorities insertAuthority(Authorities authorities);

	void deleteAuthorityById(int id);
}

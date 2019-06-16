package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.domain.Authorities;
import com.shop.repository.AuthoritiesRepo;

@Service
public class AuthoritiesServiceImpl implements AuthoritiesService {

	@Autowired
	private AuthoritiesRepo authoritiesRepo;

	@Override
	public List<Authorities> findAllAuthorities() {
		return authoritiesRepo.findAll();
	}

	@Override
	public Authorities findAuthorityById(int id) {
		return authoritiesRepo.findById(id).get();
	}

	@Override
	public Authorities updateAuthority(Authorities authorities) {
		return authoritiesRepo.save(authorities);
	}

	@Override
	public Authorities insertAuthority(Authorities authorities) {
		return authoritiesRepo.save(authorities);
	}

	@Override
	public void deleteAuthorityById(int id) {
		authoritiesRepo.deleteById(id);
	}

}

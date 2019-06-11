package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.domain.Stoc;
import com.shop.repository.StocRepo;

@Service
public class StocServiceImpl implements StocService {

	@Autowired
	private StocRepo stocRepo;

	@Override
	public List<Stoc> findAllStocs() {
		return stocRepo.findAll();
	}

	@Override
	public Stoc findById(Long id) {
		return stocRepo.findById(id).get();
	}

	@Override
	public Stoc updateStoc(Stoc stoc) {
		return stocRepo.save(stoc);
	}

	@Override
	public Stoc insertStoc(Stoc stoc) {
		return stocRepo.save(stoc);
	}

	@Override
	public void deleteStocById(Long id) {
		stocRepo.deleteById(id);
	}

}

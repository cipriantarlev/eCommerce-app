package com.shop.service;

import java.util.List;

import com.shop.domain.Stoc;

public interface StocService {

	List<Stoc> findAllStocs();

	Stoc findById(Long id);

	Stoc updateStoc(Stoc stoc);

	Stoc insertStoc(Stoc stoc);

	void deleteStocById(Long id);
}

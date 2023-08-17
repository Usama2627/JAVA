package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.dto.MarketDTO;

public interface MarketRepository {

	int COUNT=5;

	void save(MarketDTO marketDTO);

}
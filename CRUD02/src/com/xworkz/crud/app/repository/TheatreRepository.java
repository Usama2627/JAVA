package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.dto.TheatreDTO;

public interface TheatreRepository {

	int TOTAL_ITEMS=5;

	void save(TheatreDTO theatreDTO);

}


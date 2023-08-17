package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.dto.PilotDTO;

public interface PilotRepository {

	int TOTAL=5;

	void save(PilotDTO pilotDTO);

}

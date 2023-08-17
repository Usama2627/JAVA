package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.dto.MetroStaffDTO;

public interface MetroStaffRepository {

	int TOTAL_WORKERS=5;

	void save(MetroStaffDTO metroStaffDTO);

}


package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.dto.MetroStaffDTO;

public class MetroStaffRepositoryImpl implements MetroStaffRepository{

	private MetroStaffDTO[] metro=new MetroStaffDTO[TOTAL_WORKERS];
	private int index=0;

	@Override
	public void save(MetroStaffDTO metroStaffDTO) {
		System.out.println("Invoking MetroStaffDTO in MetroStaffDTOImpl");

		if(this.index<TOTAL_WORKERS)
		{
			this.metro[index]=metroStaffDTO;
			index++;
		}
		else
		{
			System.err.println("Full");
		}

	}

}

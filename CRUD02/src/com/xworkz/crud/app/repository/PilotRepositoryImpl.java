package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.dto.PilotDTO;

public class PilotRepositoryImpl implements PilotRepository{

	private int index=0;
	private PilotDTO[] pilot=new PilotDTO[TOTAL];

	@Override
	public void save(PilotDTO pilotDTO) 
	{
		System.out.println("Invoking PilotDTO in PilotRepositoryImpl");
		if(this.index<TOTAL)
		{
			this.pilot[index]=pilotDTO;
			index++;
		}
		else
		{
			System.err.println("Full");
		}


	}

}
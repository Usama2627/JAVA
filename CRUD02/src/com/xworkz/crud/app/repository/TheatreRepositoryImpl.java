package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.dto.TheatreDTO;

public class TheatreRepositoryImpl implements TheatreRepository{


	private int index=0;
	private TheatreDTO[] theatres=new TheatreDTO[TOTAL_ITEMS];

	@Override
	public void save(TheatreDTO theatreDTO) 
	{
		System.out.println("Invoking TheatreDTO in TheatreRepositoryImpl");
		if(this.index<TOTAL_ITEMS)
		{
			this.theatres[index]=theatreDTO;
			index++;
		}
		else
		{
			System.err.println("Full");
		}

	}




}


package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.dto.MarketDTO;

public class MarketRepositoryImpl implements MarketRepository{

	private int index=0;
	private MarketDTO[] market=new MarketDTO[COUNT];

	@Override
	public void save(MarketDTO marketDTO) 
	{
		System.out.println("Invoking MarketDTO in MarketRepositoryImpl");
		if(this.index<COUNT)
		{
			this.market[index]=marketDTO;
			index++;
		}
		else
		{
			System.err.println("Full");
		}

	}



}

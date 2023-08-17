package com.xworkz.crud.runner;

import com.xworkz.crud.app.repository.MarketRepository;
import com.xworkz.crud.app.repository.MarketRepositoryImpl;
import com.xworkz.crud.app.dto.MarketDTO;


public class MarketRunner {

	public static void main(String[] args) {

		System.out.println("Running Main.....\n");

		MarketRepository marketRepository=new MarketRepositoryImpl();

		MarketDTO marketDTO=new MarketDTO("Market1","Veg",100,1000,"O1");
		System.out.println(marketDTO);
		marketRepository.save(marketDTO);

		MarketDTO marketDTO1=new MarketDTO("Market2","Non-Veg",200,100,"O2");
		System.out.println(marketDTO1);
		marketRepository.save(marketDTO1);

		MarketDTO marketDTO2=new MarketDTO("Market3","Veg",500,10,"O3");
		System.out.println(marketDTO2);
		marketRepository.save(marketDTO2);

		MarketDTO marketDTO3=new MarketDTO("Market4","Non-Veg",200,5,"O3");
		System.out.println(marketDTO3);
		marketRepository.save(marketDTO3);

		MarketDTO marketDTO4=new MarketDTO("Market5","Veg",2000,10,"O4");
		System.out.println(marketDTO4);
		marketRepository.save(marketDTO4);

	}

}

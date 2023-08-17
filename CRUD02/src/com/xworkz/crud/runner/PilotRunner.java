package com.xworkz.crud.runner;

import com.xworkz.crud.app.dto.PilotDTO;
import com.xworkz.crud.app.repository.PilotRepository;
import com.xworkz.crud.app.repository.PilotRepositoryImpl;

public class PilotRunner {

	public static void main(String[] args) {

		System.out.println("Running Main.....\n");

		PilotRepository pilotRepository=new PilotRepositoryImpl();


		PilotDTO pilotDTO=new PilotDTO("A","Bengalore",true,200000,25);
		System.out.println(pilotDTO);
		pilotRepository.save(pilotDTO);

		PilotDTO pilotDTO1=new PilotDTO("B","Mysore",true,30000,29);
		System.out.println(pilotDTO1);
		pilotRepository.save(pilotDTO1);

		PilotDTO pilotDTO2=new PilotDTO("C","Hyderabad",true,25000,22);
		System.out.println(pilotDTO2);
		pilotRepository.save(pilotDTO2);

		PilotDTO pilotDTO3=new PilotDTO("D","Chennai",true,28000,23);
		System.out.println(pilotDTO3);
		pilotRepository.save(pilotDTO3);

		PilotDTO pilotDTO4=new PilotDTO("E","Pune",true,30700,30);
		System.out.println(pilotDTO4);
		pilotRepository.save(pilotDTO4);



	}

}


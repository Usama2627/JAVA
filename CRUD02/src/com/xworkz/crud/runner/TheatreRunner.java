package com.xworkz.crud.runner;

import com.xworkz.crud.app.dto.TheatreDTO;
import com.xworkz.crud.app.repository.TheatreRepository;
import com.xworkz.crud.app.repository.TheatreRepositoryImpl;

public class TheatreRunner {

	public static void main(String[] args) {

		System.out.println("Running Main.....\n");

		TheatreRepository theaterRepository=new TheatreRepositoryImpl();


		TheatreDTO theatreDto=new TheatreDTO("T1","M1", "O1", false,"L1");
		System.out.println(theatreDto);
		theaterRepository.save(theatreDto);

		TheatreDTO theatreDto1=new TheatreDTO("T2","M2", "O2", false,"L2");
		System.out.println(theatreDto1);
		theaterRepository.save(theatreDto1);

		TheatreDTO theatreDto2=new TheatreDTO("T3","M3", "O3", false,"L3");
		System.out.println(theatreDto2);
		theaterRepository.save(theatreDto2);

		TheatreDTO theatreDto3=new TheatreDTO("T4","M4", "O4", false,"L4");
		System.out.println(theatreDto3);
		theaterRepository.save(theatreDto3);

		TheatreDTO theatreDto4=new TheatreDTO("T5","M5", "O5", false,"L5");
		System.out.println(theatreDto4);
		theaterRepository.save(theatreDto4);

	}

}

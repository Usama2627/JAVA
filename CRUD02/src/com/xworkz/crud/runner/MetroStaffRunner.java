package com.xworkz.crud.runner;

import com.xworkz.crud.app.dto.MetroStaffDTO;
import com.xworkz.crud.app.repository.MetroStaffRepository;
import com.xworkz.crud.app.repository.MetroStaffRepositoryImpl;

public class MetroStaffRunner {

	public static void main(String[] args) {

		System.out.println("Running Main.....\n");

		MetroStaffRepository metroStaffRepository=new MetroStaffRepositoryImpl();

		MetroStaffDTO metroStaffDTO=new MetroStaffDTO("A","M1",40,"Bangalore",20000);
		System.out.println(metroStaffDTO);
		metroStaffRepository.save(metroStaffDTO);

		MetroStaffDTO metroStaffDTO1=new MetroStaffDTO("B","M2",30,"Hyderabad",18000);
		System.out.println(metroStaffDTO1);
		metroStaffRepository.save(metroStaffDTO1);

		MetroStaffDTO metroStaffDTO2=new MetroStaffDTO("C","M3",33,"Chennai",18050);
		System.out.println(metroStaffDTO2);
		metroStaffRepository.save(metroStaffDTO2);

		MetroStaffDTO metroStaffDTO3=new MetroStaffDTO("D","M4",30,"Bangalore",18500);
		System.out.println(metroStaffDTO3);
		metroStaffRepository.save(metroStaffDTO3);

		MetroStaffDTO metroStaffDTO4=new MetroStaffDTO("E","M5",28,"Mysore",22000);
		System.out.println(metroStaffDTO4);
		metroStaffRepository.save(metroStaffDTO4);


	}

}


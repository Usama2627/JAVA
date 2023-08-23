package com.xworkz.runner;

import com.xworkz.app.dto.ThiefDTO;
import com.xworkz.service.thief.ThiefService;
import com.xworkz.service.thief.ThiefServiceImpl;

public class ThiefRunner {

	public static void main(String[] args) {

		System.out.println("Save and Validate operation is running in Theif Runner\n");
		ThiefDTO dto = new ThiefDTO("chain snatching", 2.5, 24, null, 0);
		ThiefService service = new ThiefServiceImpl();

		service.saveAndValidate(dto);

	}

}

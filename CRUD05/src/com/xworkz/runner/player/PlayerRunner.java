package com.xworkz.runner.player;

import com.xworkz.dto.player.PlayerDTO;
import com.xworkz.repository.player.PlayerRepository;
import com.xworkz.repository.player.PlayerRepositoryImpl;

public class PlayerRunner {

	public static void main(String[] args) {

		PlayerDTO dto1 = new PlayerDTO("Virat Kohli", 33, "Indian");
		PlayerDTO dto2 = new PlayerDTO("Kane Williamson", 31, "New Zealand");
		PlayerDTO dto3 = new PlayerDTO("Joe Root", 31, "England");
		PlayerDTO dto4 = new PlayerDTO("Steve Smith", 32, "Australia");
		PlayerDTO dto5 = new PlayerDTO("Babar Azam", 26, "Pakistan");
		PlayerDTO dto6 = new PlayerDTO("David Warner", 34, "Australia");
		PlayerDTO dto7 = new PlayerDTO("Rohit Sharma", 34, "Indian");


		PlayerRepository playerRepository = new PlayerRepositoryImpl();
		boolean exist = playerRepository.isExist(dto1);
		if(!exist) {
			playerRepository.save(dto1);
		}

		System.out.println("==================================");

		exist = playerRepository.isExist(dto2);
		if(!exist) {
			playerRepository.save(dto2);
		}

		System.out.println("==================================");

		exist = playerRepository.isExist(dto3);
		if(!exist) {
			playerRepository.save(dto3);
		}

		System.out.println("==================================");

		exist = playerRepository.isExist(dto4);
		if(!exist) {
			playerRepository.save(dto4);
		}

		System.out.println("==================================");

		exist = playerRepository.isExist(dto5);
		if(!exist) {
			playerRepository.save(dto5);
		}

		System.out.println("==================================");

		exist = playerRepository.isExist(dto6);
		if(!exist) {
			playerRepository.save(dto6);
		}

		System.out.println("==================================");

		exist = playerRepository.isExist(dto7);
		if(!exist) {
			playerRepository.save(dto7);
		}

	}

}

package com.xworkz.village;

import com.xworkz.village.inner.OldVillage;
import com.xworkz.village.outer.NewVillage;

public class VillageRunner {

	public static void main(String[] args) {

		NewVillage nv = new NewVillage();
		nv.enter();
		nv.exit();

		OldVillage ov = new OldVillage();
		ov.enter();
		ov.exit();
	}

}

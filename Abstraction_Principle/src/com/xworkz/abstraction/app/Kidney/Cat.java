package com.xworkz.abstraction.app.Kidney;

public class Cat {

	private Kidney kidney;

	public Cat(Kidney kidney) {
		super();
		this.kidney = kidney;
	}

	public void getClean() {
		if (kidney != null) {
			System.out.println("kidney is not null, can proceed");
			this.kidney.clean();
		}
		else {
			System.err.println("kidney is null, stop");
		}
	}

}

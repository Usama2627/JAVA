package com.xworkz.daimond.colddrink;

public interface PepsiColdDrink extends ColdDrink{

	void energyDrink();

	default void cold() {

	}

}

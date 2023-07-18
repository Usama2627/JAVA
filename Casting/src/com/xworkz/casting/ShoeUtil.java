package com.xworkz.casting;

public class ShoeUtil {

	static void buy(Shoe shoe)
	{
		if(shoe != null)
		{
			System.out.println("Null check for shoe in ShoeUtil...");
		}

		else
		{
			System.err.println("errrrrrrrrrrrrrrrrrrrrrr");
		}

		if(shoe instanceof PumaShoe)
		{
			PumaShoe pumaShoe = (PumaShoe) shoe;
			pumaShoe.printInfo();
		}

		if(shoe instanceof NikeShoe)
		{
			NikeShoe nikeShoe = (NikeShoe) shoe;
			nikeShoe.printInfo();
		}
	}

}

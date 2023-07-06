class Pot {

	String name = "PPPPPPPPPPPPP";
	int weight;
	int price;
	String flower;
	String colour;
	int height;
	String soil;
	boolean good;

	Pot(String name,int weight,int price,String flower,String colour,int height,String soil,boolean good)
	{
		System.out.println("running const...");
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.flower = flower;
		this.colour = colour;
		this.height = height;
		this.soil = soil;
		this.good = good;
	}
}


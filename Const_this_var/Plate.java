class Plate {
	
	String name = "PPPPPPPPPPPPPPPP";
	String colour;
	int price;
	int width;
	String type;
	int capacity;
	int thickness;
	String shape;

	Plate(String name,String colour,int price,int width,String type,int capacity,int thickness,String shape)
	{
		System.out.println("running const...");
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.width = width;
		this.type = type;
		this.capacity = capacity;
		this.thickness = thickness;
		this.shape = shape;
	}
}


class Scissor{
	String brand = "XYZ" ;
	String color;
	String type ;
	String usage = "Cutting";
	char size;
	double price = 100;
	String material = "Steel";
	
	Scissor()
	{
		System.out.println("running C1");
	}
	
	Scissor(String brand)
	{
		System.out.println("running C2");
		this.brand = brand;
	}
	
	Scissor(String brand ,String color ,String type)
	{
		System.out.println("running C3");
		this.brand = brand;
		this.color = color;
		this.type = type;
	}
	
	Scissor(String brand ,String type ,String color ,char size)
	{
		System.out.println("running C4");
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.size = size;
	}
	
	
	Scissor(String brand ,String type ,String color ,char size ,double price)
	{
		System.out.println("running C5");
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.size = size;
		this.price = price;
	}
	
	
	Scissor(String brand ,String type ,String color ,char size , double price,String usage)
	{
		System.out.println("running C6");
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.size = size;
		this.price = price;
		this.usage = usage;
	}
	
	Scissor(String brand ,String type ,String color ,char size , double price ,String usage ,String material)
	{
		System.out.println("running C7");
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.size = size;
		this.price = price;
		this.usage = usage;
		this.material = material;
	}
}	

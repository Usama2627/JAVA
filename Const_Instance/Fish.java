class Fish {

		String name;
		String type;
		double price = 200;
		String location;
		
	Fish()
	{
		System.out.println("running C1");
		
	}
	
	Fish(String name)
	{
		System.out.println("running C2");
		this.name = name;
	}
	
	Fish(String name, String type)
	{
		System.out.println("running C3");
		this.name = name;
		this.type = type;
	}
	
	Fish(String name, String type, double price, String location)
	{
		System.out.println("running C4");
		this.name = name;
		this.type = type;
		this.price = price;
		this.location = location;
	}
	
}
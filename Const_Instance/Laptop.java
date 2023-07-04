class Laptop {
	String name = "Asus";
	double price = 90000;
	int quantity;
	
	Laptop()
	{
	System.out.println("running C1");
	}
	
	Laptop(String name)
	{
	    	System.out.println("running C2");
	        this.name = name;
	}
	
	Laptop(String name, double price, int quantity)
	{
			System.out.println("running C3");
                this.name = name;
				this.price= price;
				this.quantity= quantity;
	}
}
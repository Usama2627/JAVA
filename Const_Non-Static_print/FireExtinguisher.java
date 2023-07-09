class FireExtinguisher{

	String manufacturer = "FFFFFFFFFFFFFFFFFFFFFF";
	String usage;
	int price;
	String type;
	double capacity;

	FireExtinguisher(String manufacturer, String usage, int price, String type, double capacity){
		
		System.out.println("Running String, String, int, String, double const in FireExtinguisher");
		this.manufacturer = manufacturer;
		this.usage = usage;
		this.price = price;
		this.type = type;
		this.capacity = capacity;
	}

	void info(){
		System.out.println("Running non-static method in FireExtinguisher");
		System.out.println(manufacturer);
		System.out.println(usage);
		System.out.println(price);
		System.out.println(type);
		System.out.println(capacity);
	}
}



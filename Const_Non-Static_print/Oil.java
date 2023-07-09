class Oil {
	
	String brand = "OOOOOOOOOOOOOOOOO";
	String type;
	int price;
	String origin;
	double quantity;

	Oil(String brand, String type, int price, String origin, double quantity) {
		System.out.println("Running String, String, int, String, double constructor in Oil");
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.origin = origin;
		this.quantity = quantity;
	}

	void info() {
		System.out.println("Running non-static method in Oil");
		System.out.println(brand);
		System.out.println(type);
		System.out.println(price);
		System.out.println(origin);
		System.out.println(quantity);
	}
}



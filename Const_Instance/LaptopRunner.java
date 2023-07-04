class LaptopRunner{
	
	public static void main(String[] Laptops){
		System.out.println("running main");
		
		Laptop ref = new Laptop(); 
			System.out.println(ref.name);
			System.out.println(ref.price);
			System.out.println(ref.quantity);
			
		Laptop ref1 = new Laptop("HP"); 
			System.out.println(ref1.name);
			System.out.println(ref1.price);
			System.out.println(ref1.quantity);
		
		Laptop ref2 = new Laptop("Acer" , 60000, 20); 
			System.out.println(ref2.name);
			System.out.println(ref2.price);
			System.out.println(ref2.quantity);
	}
}

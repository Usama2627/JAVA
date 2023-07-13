public class Tv {
	static String name;
	double price;

	public static void main(String[] args) {
		System.out.println("Running main in Tv");
		  
		Tv ref1  = new Tv();
		Tv ref2  = new Tv();
		
		ref1.price =4000;
		ref2.price = 5000;
		
		ref1.getPrice();
		System.out.println("");
		ref2.getPrice();
	}
	
	static {
		Tv.name = "Samsung";
	}
	
	static void getName() {
		System.out.println(Tv.name);
			
		}
		
		 
	void getPrice() {
		System.out.println("Running non static method in TV");
		getName();
		System.out.println(this.price);
		
		
		}
}

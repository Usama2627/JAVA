class Kebab{
	String name;
	double price = 300;
	String hotelName;
	int noOfPieces = 4;
	boolean takeAway;
	
	Kebab(){
		System.out.println("running C1");
	}
	
	Kebab(String name){
		System.out.println("running C2");
		this.name = name;
	}
	
	Kebab(String name ,double price ,String hotelName){
		System.out.println("running C3");
		this.name = name;
		this.price = price;
		this.hotelName = hotelName;
	}
	
	Kebab(String name ,double price ,String hotelName ,int noOfPieces){
		System.out.println("running C4");
		this.name = name;
		this.price = price;
		this.hotelName = hotelName;
		this.noOfPieces = noOfPieces;
	}
	
	Kebab(String name ,double price ,String hotelName ,int noOfPieces ,boolean takeAway){
		System.out.println("running C5");
		this.name = name;
		this.price = price;
		this.hotelName = hotelName;
		this.noOfPieces = noOfPieces;
		this.takeAway = takeAway;
	}
}	
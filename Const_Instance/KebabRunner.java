class KebabRunner{
	public static void main(String[] Kebabs){
		System.out.println("Running main...");
		
		Kebab ref = new Kebab();
				System.out.println(ref.name);
				System.out.println(ref.price);
				System.out.println(ref.hotelName);
				System.out.println(ref.noOfPieces);
				System.out.println(ref.takeAway);

		Kebab ref1 = new Kebab("Special Kebab");
				System.out.println(ref1.name);
				System.out.println(ref1.price);
				System.out.println(ref1.hotelName);
				System.out.println(ref1.noOfPieces);
				System.out.println(ref1.takeAway);

		Kebab ref2 = new Kebab("Spicy Kebab" , 350, "Indian Hotel" );
				System.out.println(ref2.name);
				System.out.println(ref2.price);
				System.out.println(ref2.hotelName);
				System.out.println(ref2.noOfPieces);
				System.out.println(ref2.takeAway);

		Kebab ref3 = new Kebab("Masala Kebab" , 300 , "Karnataka Hotel" , 5 );
				System.out.println(ref3.name);
				System.out.println(ref3.price);
				System.out.println(ref3.hotelName);
				System.out.println(ref3.noOfPieces);
				System.out.println(ref3.takeAway);
						
		Kebab ref4 = new Kebab("Sweet Kebab" , 380.2, "BTM Hotel" , 3 , true  );
				System.out.println(ref4.name);
				System.out.println(ref4.price);
				System.out.println(ref4.hotelName);
				System.out.println(ref4.noOfPieces);
				System.out.println(ref4.takeAway);
	}
}
class MetroRunner{
	public static void main(String[] Metros){

	System.out.println("Running main...");

	Metro ref = new Metro();
		System.out.println(ref.line);
		System.out.println(ref.distance);
		System.out.println(ref.departure);
		System.out.println(ref.destination);
		System.out.println(ref.capacity);

	Metro ref1 = new Metro("Red", 50);
		System.out.println(ref1.line);
		System.out.println(ref1.distance);
		System.out.println(ref1.departure);
		System.out.println(ref1.destination);
		System.out.println(ref1.capacity);

	Metro ref2 = new Metro("Yellow", 70, "BTM");
		System.out.println(ref2.line);
		System.out.println(ref2.distance);
		System.out.println(ref2.departure);
		System.out.println(ref2.destination);
		System.out.println(ref2.capacity);

	Metro ref3 = new Metro("Green", 90.5, "Jayanagar", "BTM");
		System.out.println(ref3.line);
		System.out.println(ref3.distance);
		System.out.println(ref3.departure);
		System.out.println(ref3.destination);
		System.out.println(ref3.capacity);

	Metro ref4 = new Metro("White" , 80, "Majestic", "Jayanagar", 3000);
		System.out.println(ref4.line);
		System.out.println(ref4.distance);
		System.out.println(ref4.departure);
		System.out.println(ref4.destination);
		System.out.println(ref4.capacity);
		
	}
}
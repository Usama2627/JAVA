class FishRunner {

	public static void main(String[] Fishes) {
		System.out.println("Running main...");
		
        Fish ref = new Fish();
			System.out.println(ref.name);
			System.out.println(ref.type);
			System.out.println(ref.price);
			System.out.println(ref.location);
		
        Fish ref1 = new Fish("Star Fish");
			System.out.println(ref1.name);
			System.out.println(ref1.type);
			System.out.println(ref1.price);
			System.out.println(ref1.location);
			
        Fish ref2 = new Fish("Golden Fish", "Aquarium");
			System.out.println(ref2.name);
			System.out.println(ref2.type);
			System.out.println(ref2.price);
			System.out.println(ref2.location);
			
        Fish ref3 = new Fish("Simple Fish", "Ocean", 250, "Arabian sea");
			System.out.println(ref3.name);
			System.out.println(ref3.type);
			System.out.println(ref3.price);
			System.out.println(ref3.location);
}

}
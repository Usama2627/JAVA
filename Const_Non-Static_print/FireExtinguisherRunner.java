class FireExtinguisherRunner{

	public static void main(String[] args){
		
		System.out.println("Running main...");

		System.out.println("Creating 1st FireExtinguisher object...");
		FireExtinguisher ref1 = new FireExtinguisher("Fire", "Class A", 5000, "type A", 5);
		ref1.info();

		System.out.println("Creating 2nd FireExtinguisher object...");
		FireExtinguisher ref2 = new FireExtinguisher("Fire2", "Class B", 6000, "type B", 6);
		ref2.info();

	}
}
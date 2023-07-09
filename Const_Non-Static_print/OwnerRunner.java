class OwnerRunner {
	
	public static void main(String[] args) {
		System.out.println("Running main...");

		System.out.println("Creating 1st Owner object...");
		Owner owner1 = new Owner("John", 35, "123 Main St", "555-1234", "john@gmail.com");
		owner1.info();

		System.out.println("Creating 2nd Owner object...");
		Owner owner2 = new Owner("Jane", 42, "456 Main3 St", "555-5678", "jane@gmail.com");
		owner2.info();
	}
}
class OilRunner {
	public static void main(String[] args) {
		System.out.println("Running main...");

		System.out.println("Creating 1st Oil object...");
		Oil oil1 = new Oil("Brand1", "Type1", 100, "Origin1", 1.5);
		oil1.info();

		System.out.println("Creating 2nd Oil object...");
		Oil oil2 = new Oil("Brand2", "Type2", 200, "Origin2", 2.5);
		oil2.info();
	}
}
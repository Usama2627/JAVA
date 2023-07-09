class WorkerRunner {

	public static void main(String[] args) {
		System.out.println("Running main...");

		System.out.println("Creating 1st Worker object...");
		Worker worker1 = new Worker("Ironman", 30, "Avenger", 8, "Stark Industry");
		worker1.info();

		System.out.println("Creating 2nd Worker object...");
		Worker worker2 = new Worker("Captain America", 35, "Captain", 8, "America");
		worker2.info();
	}
}
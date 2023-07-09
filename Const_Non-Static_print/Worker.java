class Worker {

	String name = "WWWWWWWWWWWWWWWWWWWWWWWW";
	int age;
	String occupation;
	int experience;
	String address;

	Worker(String name, int age, String occupation, int experience, String address) {
		System.out.println("Running String, int, String, int, String constructor in Worker");
		this.name = name;
		this.age = age;
		this.occupation = occupation;
		this.experience = experience;
		this.address = address;
	}

	void info() {
		System.out.println("Running non-static method in Worker");
		System.out.println(name);
		System.out.println(age);
		System.out.println(occupation);
		System.out.println(experience);
		System.out.println(address);
	}
}



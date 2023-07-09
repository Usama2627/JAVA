class Owner {
	
	String name = "OOOOOOOOOOOOOOOOOO";
	int age;
	String address;
	String phoneNumber;
	String email;

	Owner(String name, int age, String address, String phoneNumber, String email) {
		System.out.println("Running String, int, String, String, String constructor in Owner");
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	void info() {
		System.out.println("Running non-static method in Owner");
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(phoneNumber);
		System.out.println(email);
	}
}



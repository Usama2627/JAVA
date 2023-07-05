class InfosysRunner{
	public static void main(String[] Company){

	System.out.println("Running main...");

	Infosys ref = new Infosys();
		System.out.println(ref.founderName);
		System.out.println(ref.founderWifeName);
		System.out.println(ref.foundedIn);
		System.out.println(ref.totalEmployees);

	Infosys ref1 = new Infosys("Man", "Woman");
	    System.out.println(ref1.founderName);
		System.out.println(ref1.founderWifeName);
		System.out.println(ref1.foundedIn);
		System.out.println(ref1.totalEmployees);

	Infosys ref2 = new Infosys("Male", "Female", "2002");
	    System.out.println(ref2.founderName);
		System.out.println(ref2.founderWifeName);
		System.out.println(ref2.foundedIn);
		System.out.println(ref2.totalEmployees);

	Infosys ref3 = new Infosys("Boy", "Girl", "2005" , 135555);
	    System.out.println(ref3.founderName);
		System.out.println(ref3.founderWifeName);
		System.out.println(ref3.foundedIn);
		System.out.println(ref3.totalEmployees);
	}
}
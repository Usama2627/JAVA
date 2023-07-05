class Infosys{
	
	String founderName = "Narayana Murthy";
	String founderWifeName = "Sudha Murthy";
	String foundedIn;
	long totalEmployees = 335186;

	Infosys()
	{
		System.out.println("running C1");
	}
	
	Infosys(String founderName, String founderWifeName)
	{
		System.out.println("running C2");
		this.founderName = founderName;
		this.founderWifeName = founderWifeName;
	}
	
	Infosys(String founderName, String founderWifeName, String foundedIn)
	{
		this(founderName,founderWifeName);
		System.out.println("running C3");
		this.foundedIn = foundedIn;
	}
	
	Infosys(String founderName, String founderWifeName, String foundedIn, long totalEmployees)
	{
		this(founderName,founderWifeName,foundedIn);
		System.out.println("running C4");
		this.totalEmployees = totalEmployees;
	}
}

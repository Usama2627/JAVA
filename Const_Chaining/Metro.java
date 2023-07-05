class Metro {
	
	String line = "Blue";
	double distance = 120.5;
	String departure;
	String destination;
	long capacity;

	Metro()
	{
		System.out.println("running C1");
	}
	
	Metro(String line, double distance)
	{
		System.out.println("running C2");
		this.line = line;
		this.distance = distance;
	}
	
	Metro(String line, double distance, String departure)
	{
		this(line,distance);
		System.out.println("running C3");
		this.departure = departure;
	}
	
	Metro(String line, double distance, String departure, String destination)
	{
		this(line,distance,departure);
		System.out.println("running C4");
		this.destination = destination;
	}
	
	Metro(String line, double distance, String departure, String destination, long capacity)
	{
		this(line,distance,departure,destination);
        System.out.println("running C5");
		this.capacity = capacity;
	}
}
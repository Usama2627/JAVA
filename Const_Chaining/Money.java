class Money {
	
	String country = "India";
	String currency = "Rupee";
	long denomination;
	String type = "Coin";

	Money()
	{
		System.out.println("running C1");
	}
	
	Money(String country, String currency)
	{
		System.out.println("running C2");
		this.country = country;
		this.currency = currency;
	}
	
	Money(String country, String currency, long denomination)
	{
		this(country,currency);
		System.out.println("running C3");
		this.denomination = denomination;
	}
	
	Money(String country, String currency, long denomination, String type)
	{
		this(country,currency,denomination);
		System.out.println("running C4");
		this.type = type;
	}

}
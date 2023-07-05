class MoneyRunner {
	public static void main(String[] Args){

	System.out.println("Running main...");

	Money ref = new Money();
		System.out.println(ref.country);
		System.out.println(ref.currency);
		System.out.println(ref.denomination);
		System.out.println(ref.type);

	Money ref1 = new Money("US", "Dollar");
		System.out.println(ref1.country);
		System.out.println(ref1.currency);
		System.out.println(ref1.denomination);
		System.out.println(ref1.type);

	Money ref2 = new Money("Kuwaiti", "Dinar", 50);
		System.out.println(ref2.country);
		System.out.println(ref2.currency);
		System.out.println(ref2.denomination);
		System.out.println(ref2.type);

	Money ref3 = new Money("Russain", "Ruble", 80, "Banknote");
		System.out.println(ref3.country);
		System.out.println(ref3.currency);
		System.out.println(ref3.denomination);
		System.out.println(ref3.type);

	}
}
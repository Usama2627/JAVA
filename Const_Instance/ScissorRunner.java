class ScissorRunner{
	public static void main(String[] Scissors){
		System.out.println("Running main...");
		
		Scissor ref = new Scissor();
				System.out.println(ref.brand);
				System.out.println(ref.color);
				System.out.println(ref.type);
				System.out.println(ref.usage);
				System.out.println(ref.size);
				System.out.println(ref.price);
				System.out.println(ref.material);

		Scissor ref1 = new Scissor("MI");
				System.out.println(ref1.brand);
				System.out.println(ref1.color);
				System.out.println(ref1.type);
				System.out.println(ref1.usage);
				System.out.println(ref1.size);
				System.out.println(ref1.price);
				System.out.println(ref1.material);

		Scissor ref2 = new Scissor("G5" , "Black", "Simple Scissor" );
				System.out.println(ref2.brand);
				System.out.println(ref2.color);
				System.out.println(ref2.type);
				System.out.println(ref2.usage);
				System.out.println(ref2.size);
				System.out.println(ref2.price);
				System.out.println(ref2.material);

		Scissor ref3 = new Scissor("N5", "Special Scissor" , "Blue" , 'L');
				System.out.println(ref3.brand);
				System.out.println(ref3.color);
				System.out.println(ref3.type);
				System.out.println(ref3.usage);
				System.out.println(ref3.size);
				System.out.println(ref3.price);
				System.out.println(ref3.material);
						
		Scissor ref4 = new Scissor("J6" ,"Simple Scissor", "Green" ,'M',200);
				System.out.println(ref4.brand);
				System.out.println(ref4.color);
				System.out.println(ref4.type);
				System.out.println(ref4.usage);
				System.out.println(ref4.size);
				System.out.println(ref4.price);
				System.out.println(ref4.material);
				
		Scissor ref5 = new Scissor("k3" ,"Paper Scissor", "White" , 'M' , 150, "Cutting");
				System.out.println(ref5.brand);
				System.out.println(ref5.color);
				System.out.println(ref5.type);
				System.out.println(ref5.usage);
				System.out.println(ref5.size);
				System.out.println(ref5.price);
				System.out.println(ref5.material);

		Scissor ref6 = new Scissor("S6" ,"Cloth Scissor", "Red" , 'L', 300, "Cloth cutting", "fiber"   );
				System.out.println(ref6.brand);
				System.out.println(ref6.color);
				System.out.println(ref6.type);
				System.out.println(ref6.usage);
				System.out.println(ref6.size);
				System.out.println(ref6.price);
				System.out.println(ref6.material);
	}
}

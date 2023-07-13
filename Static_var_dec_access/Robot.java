public class Robot {

	 static String owner;
	 String manufactured;
	 
	 public static void main(String[] args) {
		 System.out.println("Running main in Robot");
		 Robot ref1 = new Robot();
		 Robot ref2 = new Robot();
		 
		 ref1.manufactured = "June2023";
		 ref2.manufactured = "Oct2023";
		 
		 ref1.getmanufactured();
		 System.out.println("");
		 ref2.getmanufactured();
		 
	 }
     
	 static {
		 Robot.owner = "ABC";
	 }
	 
	 static void getowner() {
		 System.out.println(Robot.owner);
	 }
	 
	 void getmanufactured() {
		 System.out.println("Running non static method in Robot :");
		 System.out.println(this.manufactured);
		 getowner();
	 }
}

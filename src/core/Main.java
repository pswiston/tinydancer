package core;

public class Main {
	
	public static void main(String[] args) {
		
		String helloWorld = "Hello World this is a long string that i dont want to repeat";
		Integer number = 7;
		
		Human ethan = new Human();
		ethan.setSex("male");
		
		Human connor = new Human("male", "connor", 200.5, 73.5, 26);
		
		
		Double decimal = 7.8;
		
		
		
		System.out.println(helloWorld);
		System.out.println(number);
		System.out.println(decimal);
		System.out.println(ethan.getSex());
	}

}

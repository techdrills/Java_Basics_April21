package Basic_Java_Programming;

public class String_Operations {

	public static void main(String[] args) {
		
		// String Operations
		
		String city = "BengaLuru";
		System.out.println("Original String "+ city);
		
		// String length
		System.out.println("String length is " + city.length());
		
		// string uppercase
		System.out.println(city.toUpperCase());
	
		// string lowercase
		System.out.println(city.toLowerCase());
		
		// finding a character in a string
		String message = "CThis is Covid Pandemic Code from 2020 in ";
		System.out.println("========");
		System.out.println("starting index "+message.indexOf("C"));
		
		// String concatination (+, concat)
		// concatenation with +
		System.out.println(message + city);
		System.out.println("32000 patient death in " + city);
		
		// concat method
		System.out.println(message.concat(city));
		
		// Other String operations
		String n1 = "100";
		String n2 = "200";
		int n3 = 300;
		
		System.out.println(n1+n2+n3); // 100200300
		System.out.println(n1+n2); // 100200
		System.out.println(n3+n1); // 300100
		System.out.println(n1+n3); // 100300
		
		int n1_temp = Integer.parseInt(n1); // converting string into int
		System.out.println(n1_temp + n3); // 400
		
		int n2_temp = Integer.parseInt(n2); // converting string to int
		System.out.println(n1_temp + n2_temp + n3); // 600
		System.out.println(n1+n2+n3);
		
		String number = "500";
		int n5 = 300;
		System.out.println(number+n5); // 500300
		
		int n6 = Integer.parseInt(number);
		System.out.println(n6+n5);
		
		// coverting int into a string
		
		int a = 10;
		int b = 5;
		
		String s = String.valueOf(a);  // "10" of type String
		
		System.out.println(s);
		System.out.println(a+b);
		System.out.println(s+b);
	}
	

}

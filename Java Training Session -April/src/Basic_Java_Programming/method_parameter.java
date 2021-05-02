package Basic_Java_Programming;

public class method_parameter {

	public static void main(String[] args) {
		
		addition(10,20);
		addition(100, 90);
		name("Mahesh");
		name("John");
		multiplication(5, 9);
		printStart(10);
	}
	
	public static void addition(int number1, int number2) {
//		int c = number1 + number2;
//		System.out.println(c);
		System.out.println(number1+number2);
	}
	
	public static void name(String name) {
		System.out.println("hey, Hi welcome back "+name);
	}
	
	
	public static void multiplication(int a, int b) {
		System.out.println("Multiplication is "+a*b);
	}
	
	/*
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 */
	
	public static void printStart(int n) {
		//int n=5;
		for(int i =1; i<= n; i++) {			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
	
	
	
	

}

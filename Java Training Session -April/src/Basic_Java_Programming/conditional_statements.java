package Basic_Java_Programming;

public class conditional_statements {

	public static void main(String[] args) {
		// Conditional statements
		/* 1. if statement
		 * 2. if else statement
		 * 3. else if statement
		 */
		
		// 1. if statement - it has a single condition
			// to find greater number
		int n1 = 50;
		int n2 = 55;		
		if(n1 < n2) {
			System.out.println("Number 2 i.e. n2 is grater number");
		}
		
		
			// to find voting eligibility
		int age = 4;
		if(age > 17) {
			System.out.println("Eligible for Voting...");
		}
		System.out.println("=============================");
		
		// 2. if else - 
			// voting eligibility with if else
		int age1 = 24;
		if(age1 > 17) {
			System.out.println("Eligible for Voting...");
		}
		else {
			System.out.println("Not eligible for Voting");
		}
		
			// find greater with if else
		int number1 = 30;
		int number2 = 10;
		
		if(number1 > number2) {
			System.out.println("Number 2 is greater");
		}
		else {
			System.out.println("Number 1 is lesser");
		}
		
		// 3. else if statement-
			// to find how many digits in a number
		System.out.println("=============================");
		int digit = 9;
		
		if(digit <=9) {
			System.out.println(digit + " - is One digit");
		}
		else if(digit < 100) {
			System.out.println(digit + " - is Two digits");
		}
		else if (digit < 1000) {
			System.out.println(digit + " - is Three digits");
		}
		else if (digit < 10000) {
			System.out.println(digit + " - is Four digits");
		}
		else if (digit < 100000) {
			System.out.println(digit + " - is Five digits");
		}
		else {
			System.out.println(digit + " - is more that Five digits");
		}
		
		
		
		
		

	}

}

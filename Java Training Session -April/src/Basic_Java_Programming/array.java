package Basic_Java_Programming;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		
		// Array-
		/*
		 * 1. Arraysa are used to multiple values in a signle variable
		 * 2. Instead of declaring separte variable for each value we can use the array.
		 * 3. Array can be create with data type set of elements
		 * 4. To declare an array, define the variable type with square brackets
		 * 5. syntax - 
		 * 		dataype var name[] = {value1, value2,value n};
		 */
		
		// declare an array and store the values
		
		int rollnum[] = {10,20,30,40,50,60};
		
		// to get the length of an array		
		int arraylength = rollnum.length;
		System.out.println("Array length is " + arraylength);
		
		// how to fetch all elements / iterate from the array
		
		for (int i=0; i<rollnum.length; i++) 
		{
			System.out.println(rollnum[i]);
		}
		
				
		String names[] = {"John", "Doe", "java","arrays"};
		
		for (int i=0; i<names.length; i++) 
		{
			System.out.println(names[i]);
		}
		
		System.out.println("Length of String array "+ names.length);
		
		// chanage an array element value
		
		System.out.println("Current value "+names[0]);
		names[0] = "C";
		names[1] = "C++";
		names[3] = "PHP";
			
		for (String i: names) {
			System.out.println(i);
		}
		
		
		// how to set fixed size of array
		
		int numbers[] = new int[5];
		numbers[0]=1;
		numbers[1]=2;
		numbers[2]=3;
		numbers[3]=4;
		numbers[4]=5;
		//numbers[5]=6;
		
		for (int i: numbers) {
			System.out.println(i);
		}
		System.out.println("=======");
		
	int number2[] = {1,2,3,4,5,6,7,8,9};
	for(int i: number2) {
		System.out.println(i);
	}
		
	// Run time array implementation
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first value");
	
	int newArray[]= {1,2};
	
	int num1 = sc.nextInt();
	
	newArray[0]=num1;
	
	
	System.out.println("Enter Second value");
	int num2 = sc.nextInt();
	newArray[1]=num2;
	
	for(int i: newArray) {
		System.out.println(i);
	}
	
	
		
		
		
		

	}

}

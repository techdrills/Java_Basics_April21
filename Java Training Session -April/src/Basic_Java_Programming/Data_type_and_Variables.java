package Basic_Java_Programming;

public class Data_type_and_Variables {

	public static void main(String[] args) {
	
		// Variables...
		int number = 45;
		int age=20;
		System.out.println(age);
	/* 
	 * Variables= Variables are containers used to store the data values
	 * for we can declare a varibale
	 * int number = 45;
	 * In above variable called number stored the data value is 45
	 *  
	 *  Syntax for Variable declarations
	 *  
	 *  Data Type variable name = value (intilised value);
	 *  
	 *  Example variable declartion	
	 */
		// 1. int = stores integers values (whole numbers), 
		// ex. 1,200,343
		
		int years = 23;
		System.out.println(years);
		
	
		/* String variables
		2. String = stores text set of chars or sentence
			1. String must be in double quote - ("name")
			2. ex. String name = "John";
		 */
		String name = "John";
		String fullName = "John Doe";
		String numChar = "number12345";
		String num1 = "12";
		String num2 = "45";
		String add = num1+num2;  // String concatenation
		System.out.println(add); 
		System.out.println(name);
		System.out.println(fullName);
		System.out.println(numChar);
		String line = "This is String variable introduction...";
		String Line = "this Line";
		System.out.println(line);
		
		// 3. float
		// It stores decimal values
		// ex. percentage = 65.23
		
		float percentage = 65;
		System.out.println(percentage);
		
		//4. double
		double percent = 5444.121243;
		System.out.println(percent);
		
		// 5. char = single characters
		
		char input = 'a';
		char input1 = 'A';
		
		System.out.println(input);
		System.out.println(input1);
		
		//6. boolean = it stores true or false values
		boolean status = true;
		boolean location = false;
		System.out.println(status);
		System.out.println(location);
		
		int counter = 5;
		int Counter = 5;
		
	}

}

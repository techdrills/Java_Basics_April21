package Basic_Java_Programming;

public class arithmatical_operators {

	public static void main(String[] args) {
		// different types of operators
		//1. Arithmetic operators
		//2. logical operators
		//3. comparision operators
		
		//1. Arithmetical operators are used to perform all mathematical operations
		// ex - Addition (+), Sub (-), multiplication (*), division (/), 
		// 		modules (%), increment (++), decrement (--)....
		
		int number1 = 34;
		int number2 = 20;
		int number3 = 29;
		
		int temp;
		temp = number1+number2;  // addition of two numbers
		System.out.println("Addition of two number is: "+temp);
		
		temp = number1 + number2 + number3; // addition of three numbers
		System.out.println("Addition of three numbers :"+ temp);
		
		temp = number1 - number2;
		System.out.println("Substraction of two numebers :" +temp);
		
		temp = number1 * number2;
		System.out.println("Multiplication of two number : "+ temp);
		
		temp = number1 / number2;
		System.out.println("Division of two numbers : "+temp);
		
		System.out.println(number1);
		temp = ++ number1;
		System.out.println(temp);
	}

}

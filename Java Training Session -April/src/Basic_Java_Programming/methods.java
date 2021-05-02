package Basic_Java_Programming;

public class methods {

	public static void main(String[] args) {
		
		// Methods / Functions
		/*
		 * 1. Method is a block of code/statments/business logic 
		 * 2. methods can run only when we  call it (1. direct call 2. with help of objects)
		 * 3. we pass pass multiple set of input data
		 * 4. methods are useful for certain repeated actions
		 * 5. we use methods to reduce the line of code
		 * 6. Once we decalre / creat a method we can use it any where multiple times
		 * 7. we can not create a method inside the main method
		 */
		
		// 6 + 9
		
	//	addition();
		methods obj = new methods();
		obj.addition();
		addition();
		addition2();
		
	}
	
		public static void addition() 
		{
			// method body	
			int a = 8;
			int b = 9;
			int c =a+b;
			System.out.println(c);			
						
		}
		
		public static void addition2() 
		{
			// method body	
			int a = 10;
			int b = 10;
			int c =a+b;
			System.out.println(c);			
						
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package Basic_Java_Programming;

public class for_each_loop {

	public static void main(String[] args) {
		
		/*
		 * for each loop
		 * 
		 * syntx-
		 * for(datatype data : array_name)
		 * {
		 * body of stmts
		 * }
		 */
		
		// create an array
		
		int [] numbers = {1,2,3,4,5,6,-7,-8, 4,45,56,7,8,9};
		
		
		// for each loop
		
		for (int num : numbers)
		{
			System.out.println(num);
		}
		
		for (int i=1; i<=100; i++) {
			System.out.println(i);
		}
		

	}

}

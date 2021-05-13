package Basic_Java_Programming;

import java.util.ArrayList;
import java.util.List;

public class arrayList {
	
	public static void main(String[] args) {
		
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(23);		
		//numbers.clear();
		
		for(int num: numbers) {
			System.out.println(num);
		}
		
		
		
		List<String> cities = new ArrayList<String>();
		cities.add("California");
		cities.add("Boston");
		cities.add("loss engelis");
		
		for(String city: cities) {
			System.out.println(city);
		}
		

	}

}

package Basic_Java_Programming;

public class method_overloading {

	public static void main(String[] args) {
		
		name();
		name(10);
		name('X', 'Z');
		name('a');
		name(5,9);
		name("Firstname");
	}
	
	public static void name() {
		System.out.println("name method no parameters");
	}
	
	public static void name(String name) {
		System.out.println("name method with one String parameters");
	}
	
	public static void name(int a) {
		System.out.println("this is single int parameter method");
	}
	
	public static void name(int a, int b) {
		System.out.println("this two int parameter method");
	}
	
	public static void name(char a) {
		System.out.println("this is a single char parameter method");
	}
	
	public static void name(char a, char b) {
		System.out.println("this is two parameter character method");
	}
	
	
	
	
	

}

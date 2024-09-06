package test;

public class Tests {
	
	public static void main(String[] args){
		
		int a = 2;
		int b = 3;
		String one = "Hello ";
		String two = "World!";
		System.out.println("a = " + a + " and b = " + b + " and adding equals " + addInts(a, b));
		System.out.println("one = " + one + " and two = " + two + " and adding equals " + addStrings(one, two));
	}
	
	public static int addInts(int a, int b) {
		return a + b;
	}
	
	public static String addStrings(String a, String b){
		return a + b;
	}
}

package assignment;

public class ArithMetic {
	
	static int sum(int a,int b) {
		return a+b;
	}
	static int difference(int a,int b) {
		return a-b;
	}
	static int product(int a,int b) {
		return a*b;
	}
	static int quotient(int a,int b) {
		return a/b;
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		System.out.println(sum(a,b));
		System.out.println(difference(a,b));
		System.out.println(product(a,b));
		System.out.println(quotient(a,b));
	}
}

package acc;

public class Fibonacci {
	
	static void printFibonacci(int num) {
		int a = 0;
		int b = 1;
		int c = 0;
		for(int i=0;i<num;i++) {
			System.out.println(c);
			c = a+b;
			b=a;
			a=c;
		}
	}
	
	public static void main(String[] args) {
		printFibonacci(5);
	}
}

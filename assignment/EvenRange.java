package assignment;

public class EvenRange {
	
	static void evenNumbersBetween(int a, int b) {
		
		for (int i = a; i < b; i++) {
			if(i%2==0)
				System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		int a = 11;
		int b = 99;
		evenNumbersBetween(a, b);
	}
}

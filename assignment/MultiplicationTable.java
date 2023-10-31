package assignment;

public class MultiplicationTable {
	
	static void mulTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i*n);
		}
	}
	public static void main(String[] args) {
		mulTable(7);
	}
}

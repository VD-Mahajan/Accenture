package acc;

public class SwitchDemo {
	
	static int operationChoices(int c, int a, int b) {
		int n = 0;
		
		switch(c) {
		case 1:
			n= a+b;
			break;
		case 2:
			n = a-b;
			break;
		case 3:
			n = a*b;
			break;
		case 4:
			n = a/b;
			break;
		}
		
		return n;
	}
	public static void main(String[] args) {
		int ans = operationChoices(2, 16, 20);
		System.out.println(ans);
	}
}

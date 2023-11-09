package acc;

public class NextPalindrome {
	
	private static int nextPalindrome(int number) {
		int num=number;
		for(int i=num+1;i<Integer.MAX_VALUE;i++) {
			int temp = i;
			int rev = 0;
			while(temp!=0) {
				int rem = temp%10;
				rev = rev*10+rem;
				temp/=10;
			}
			if(rev==i) {
				return i;
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		int number = 56;
		System.out.println(nextPalindrome(number));
	}
	
}

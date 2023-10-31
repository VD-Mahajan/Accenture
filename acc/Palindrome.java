package acc;

public class Palindrome {
	
	static boolean isPalindrome(String str) {
		
		StringBuffer str2 = new StringBuffer(str);
		str2 = str2.reverse();
		String str3 = str2.toString();
		if(str.equals(str3))
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) {
		String str = "nayan";
		if(isPalindrome(str))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

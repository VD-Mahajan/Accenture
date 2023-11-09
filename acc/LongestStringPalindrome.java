package acc;

public class LongestStringPalindrome {
	
	private static String longestPalindrome(String str) {
		String longestString="",str3;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<=str.length();j++) {
				String str2 = str.substring(i,j);
				StringBuffer sb = new StringBuffer(str2);
				sb = sb.reverse();
				str3 = sb.toString();
				
				if(str3.equals(str2)) {
					if(str2.length()>max) {
						longestString=str2;
						max=str2.length();
					}
				}
			}
		}
		
		return longestString;
	}
	
	public static void main(String[] args) {
		String str = "sdfhisdskjfnasnanasjdlvnayansdkjsd";
		String ans = longestPalindrome(str);
		System.out.println(ans);
	}
	
}
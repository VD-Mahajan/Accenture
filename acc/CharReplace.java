package acc;

public class CharReplace {
	
	static String replaceChar(String str,char ch1,char ch2) {
		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==ch1) {
				ch[i]=ch2;
			}else if(ch[i]==ch2) {
				ch[i]=ch1;
			}
		}
		
		StringBuffer newStr = new StringBuffer();
		for (int i = 0; i < ch.length; i++) {
			newStr.append(ch[i]);
		}
		String str1 = newStr.toString();
		return str1;
		
	}
	
	public static void main(String[] args) {
		
		String newStr = replaceChar("apples",'a','p');
		System.out.println(newStr);
	}
}

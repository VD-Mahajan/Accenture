package assignment;

public class StringReverse {
	static String reverse(String str) {
		StringBuffer sb = new StringBuffer(str);
		str = sb.reverse().toString();
		return str;
	}
	public static void main(String[] args) {
		String name = "Vishal";
		String rev = reverse(name);
		
		System.out.println(rev);
	}
}

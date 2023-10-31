package acc;

public class BinaryString {
	
	static int output(String str) {
		int ans = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='A') {
				ch[i]='&';
			}else if(ch[i]=='B') {
				ch[i]='|';
			}else if(ch[i]=='C') {
				ch[i]='^';
			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		for (int i = 0; i < ch.length; i=i+2) {
			if(i<ch.length-2) {
				if(ch[i+1]=='&') {
					int x = (int)ch[i];
					int y = (int)ch[i+2];
					ans = x&y; 
				}else if(ch[i+1]=='|') {
					int x = (int)ch[i];
					int y = (int)ch[i+2];
					ans = x|y; 
				}				
			}
		}
		
		return ans;
	}
	
	
	
	public static void main(String[] args) {
		String str = "1A0B1";
		int ans = output(str);
		System.out.println(ans);
	}
}

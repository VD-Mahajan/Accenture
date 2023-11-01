package assignment;

public class WordOccurence {
	
	static int occurenceOfWord(String str1 , String str2) {
		int count = 0;
		for(int i=0;i<str1.length()-str2.length()+1;i++) {
			if(str1.substring(i,i+str2.length()).equals(str2))
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		String str = "aaaabavishalaachdgfbbfb";
		int count = occurenceOfWord(str,"fb");
		System.out.println(count);
	}
}

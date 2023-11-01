package assignment;
import java.util.*;

public class LongestWordInList {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Vishal");
		list.add("Shriram");
		list.add("Om");
		list.add("Vaibhav");
		list.add("Prajwal");
		list.add("Abhishek");
		
		String longestString = "";
		String str = null;
		
		ListIterator<String> litr = list.listIterator();
		while(litr.hasNext()) {
			str = litr.next();
			if(str.length()>longestString.length())
				longestString=str;
		}
		
		System.out.println(longestString);
	}
}

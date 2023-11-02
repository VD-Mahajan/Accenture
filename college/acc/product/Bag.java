package college.acc.product;
import java.util.*;

public class Bag extends Product{
	
	private static Set<String> set = new LinkedHashSet<>();
	private String name;
	
	public Bag(String name) {
		this.name = name;
		set.add(name);
	}

	public static void showBagNames() {
		
		for(String element : set) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	
}

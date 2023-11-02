package college.acc.product;

import java.util.LinkedHashSet;
import java.util.Set;

public class Pen extends Product {
	private static Set<String> set = new LinkedHashSet<>();
	private String name;
	
	public Pen(String name) {
		this.name = name;
		set.add(name);
	}
	
	public static void showPenNames() {
		
		for(String element : set) {
			System.out.print(element+"  ");
		}
		System.out.println();
	}

}

package ProductApplication;
import java.util.*;

public class Client {
	
	public static void main(String[] args) {
		
		Map<Product,Integer> inventory = new HashMap<Product, Integer>();
		inventory.put(new Bag("Asus"),2);
		inventory.put(new Bag("Asus"),1);
		inventory.put(new Bag("Dell"),2);
		inventory.put(new Pen("cello"),2);
		
		System.out.println(Show.calculate_total_value(inventory));
		System.out.println(Show.calculate_pen_value(inventory));
		System.out.print("Bag Name : ");
		Bag.showBagNames();
		System.out.print("Pen Name : ");
		Pen.showPenNames();
		Product.search(inventory,"Lenovo");
		
	}
	
}


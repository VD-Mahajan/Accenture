package college.acc.product;
import java.util.*;
import java.util.Map.Entry;
public class Show {
	private static final int penPrice = 5;
	private static final int bagPrice = 500;
	
	public static int calculate_total_value(Map<Product,Integer> inventory) {
		int total = 0;
		int penQuantity = 0;
		int bagQuantity = 0;
		
		for(Entry<Product,Integer> element : inventory.entrySet()) {
			if(element.getKey() instanceof Pen) {
				penQuantity += element.getValue();
			}
			if(element.getKey() instanceof Bag) {
				bagQuantity += element.getValue();
			}
		}
		total = penQuantity*penPrice+bagQuantity*bagPrice;
		return total;
	}
	
	public static int calculate_pen_value(Map<Product,Integer> inventory) {
		int penQuantity = 0;
		
		for(Entry<Product,Integer> element : inventory.entrySet()) {
			if(element.getKey() instanceof Pen) {
				penQuantity += element.getValue();
			}
		}
		
		return penQuantity*penPrice;		
	}
	
}

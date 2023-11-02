package ProductApplication;

import java.util.Map;

abstract public class Product {
	String name;
	public Product(String name) {
		this.name=name;
	}
	
	public static void searchProduct(Map<Product,Integer> inventory,String product) {
		
		if(inventory!=null && inventory.isEmpty()==false) {
			for (Map.Entry<Product,Integer> element : inventory.entrySet()) {
				if(product.equals((element.getKey().name))) {
					System.out.println(product+" is present in inventory");
					return;
				}				
			}
			System.out.println(product+" is not present in inventory");
		}
	}
	
}

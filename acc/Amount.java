package acc;

public class Amount {
	
	static int amountRemaining(int amount,int percentage,int tenure) {
		while(tenure!=0) {
			amount-=(amount*percentage)/100;
			tenure--;
		}
		
		return amount;
	}
	
	public static void main(String[] args) {
		int ans = amountRemaining(1000, 10, 3);
		System.out.println(ans);
	}
	
}

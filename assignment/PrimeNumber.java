package assignment;

public class PrimeNumber {
	static boolean isPrime(int num) {
		
		if(num<2)
			return false;
		for(int i=2;i<=(num/2);i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int num = 97;
		if(isPrime(num))
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}

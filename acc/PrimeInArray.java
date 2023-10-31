package acc;

public class PrimeInArray {
	
	static boolean isPrime(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<2)
				return false;
			for(int j=2;j<=(arr[i]/2);j++) {
				if(arr[i]%j==0)
					return false;
				else
					continue;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {3,3,3,3,7,3,3};
		if(isPrime(arr))
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}

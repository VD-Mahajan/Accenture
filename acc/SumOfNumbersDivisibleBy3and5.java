package acc;

public class SumOfNumbersDivisibleBy3and5 {
	
	static int sumOfNumbers(int a,int b) {
		int sum = 0;
		for (int i = a; i < b; i++) {
			if(i%3==0 && i%5==0)
				sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		int ans = sumOfNumbers(12, 50);
		System.out.println(ans);
	}
}

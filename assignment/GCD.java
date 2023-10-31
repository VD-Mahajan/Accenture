package assignment;

public class GCD {
	
	static int gcd(int a,int b) {
		int greatestDivisor = -1;
		if(b>a) {
			a=a^b;
			b=a^b;
			a=a^b;
		}
		for(int i=1;i<=b;i++) {
			if(a%i==0 && b%i==0)
				greatestDivisor = i;
		}
		return greatestDivisor;
	}
		
	public static void main(String[] args) {
		System.out.println(gcd(24,17));
	}
}

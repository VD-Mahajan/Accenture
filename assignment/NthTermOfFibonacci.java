package assignment;

public class NthTermOfFibonacci {
	
	static int nthTerm(int n) {
		
		if(n<=1)
			return n;
		
		return nthTerm(n-1)+nthTerm(n-2);
	}
	
	public static void main(String[] args) {
		
		System.out.println(nthTerm(5));
	}
}

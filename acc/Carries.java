package acc;

public class Carries {
	
	static int numberOfCarries(int num1, int num2) {
		int ans=0,carry=0,rem1,rem2;
		
		if(num2>num1) {
			num1=num1^num2;
			num2=num1^num2;
			num1=num1^num2;
		}
		
		while(num1!=0) {
			rem1 = num1%10;
			rem2 = num2%10;
			
			if(rem1+rem2+carry>=10) {
				carry=1;
				ans++;
			}else {
				carry=0;
			}
			num1/=10;
			num2/=10;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int ans = numberOfCarries(89,963);
		System.out.println(ans);
	}
}

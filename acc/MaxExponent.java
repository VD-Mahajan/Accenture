package acc;
import java.math.*;

public class MaxExponent {
	 static int maxExponent(int a,int b) {
		 int temp=1;
		 int max = -1;
		 int limit = 5;
		 
		 for(int value=a;value<=b;value++) {
			 
			 for(int j=1;j<limit;j++) {
				 temp = (int)Math.pow(2,j);
				 if(temp>value) {
					 break;
				 }
				 if(temp==value) {
					 max=temp;
				 }
				 if(temp<value && j==limit) {
					limit=limit+5; 
				 }
			 } 
		 }
		 return max;
	 }
	 
	 public static void main(String[] args) {
		int ans = maxExponent(5, 20);
		System.out.println(ans);
	}
}

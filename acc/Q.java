package acc;

//define a function that takes an Integer as an input and returns the square of the number
//condition: the number and the square should be integer 
//cases:  1)1000  2)55   2)100000  2)9999999    
//point:  You should handle the upcoming exception accordingly
import java.util.*;
public class Q {
	
	private static int square(int input) {
		int square = 0;
		
		if(input*input>Integer.MAX_VALUE) {
			square=-1;
		}else {
			square=input*input;
		}
		
		return square;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num;
		try {
			num = sc.nextInt();
			System.out.println(square(num));
		}catch(InputMismatchException e) {
			System.out.println("Invalid Input for Integer value ");
		}

	}
}

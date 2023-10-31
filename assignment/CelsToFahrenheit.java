package assignment;

public class CelsToFahrenheit {
	
	static double celsToFahrenheit(int tempInCels) {

		return (tempInCels*1.8+32);
		
	}
	public static void main(String[] args) {
		
		System.out.println(celsToFahrenheit(42)+"*F");
		
	}
}

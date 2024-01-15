package acc;

public class SunnyNumber {
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			if(Math.sqrt(i+1)-Math.floor(Math.sqrt(i+1))==0) {
				System.out.println(i);
			}
		}
	}
}

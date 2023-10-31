package assignment;

import java.security.SecureRandom;

public class PasswordGenerate {
	
	static String passwordGenerator(int n) {
		String charSet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%&";
		
		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i<n;i++) {
			int index = random.nextInt(charSet.length());
			char randomChar = charSet.charAt(index);
			sb.append(randomChar);
		}
		
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(passwordGenerator(8));
	}
}

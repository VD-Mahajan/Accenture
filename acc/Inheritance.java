package acc;

class Vehicle{
	int numberOfAirbags;
	String color;
	int numberOfTyres;
}

class TwoWheeler extends Vehicle{
	int numberOfAirbags=0;
	String color="Black";
	int numberOfTyres=2;
}
class Moped extends TwoWheeler{
	
}
class Bike extends TwoWheeler{
	
}
class Car extends Vehicle{
	int numberOfAirbags = 4;
	String color="Red";
	int numberOfTyres=4;
}

public class Inheritance {
	
	public static void main(String[] args) {
		
		
		
	}
	
}

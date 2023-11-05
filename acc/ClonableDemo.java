package acc;

class MyClass implements Cloneable{
	private String name;
	
	public MyClass(String name) {
		this.name = name;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class ClonableDemo {

	public static void main(String[] args) throws CloneNotSupportedException{

		MyClass obj1 = new MyClass("Vishal");
		MyClass obj2 = (MyClass)obj1.clone();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}

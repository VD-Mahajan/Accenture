package assignment;

public class StringSorting {

	
	public static void main(String[] args) {
		String[] arr = new String[] {"Vishal","Shriram","Om","Vaibhav","Prajwal","Abhishek"};
		int[] intArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			intArr[i]=arr[i].length();
		}
		
		for (int i = 0; i < intArr.length; i++) {
			for (int j = i+1; j < intArr.length; j++) {
				if(intArr[i]>intArr[j]) {
					String temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
				
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}

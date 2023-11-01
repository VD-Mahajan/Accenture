package assignment;
import java.util.*;

public class RemoveListElement {
	
	static int[] removeElement(int[] arr,int element) {
		int count=0;
		int a=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==element) {
				count++;
			}
		}
		int[] arr2 = new int[arr.length-count];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==element) {
				continue;
			}else {
				arr2[a++]=arr[i];		
			}
		}
		
		return arr2;
	}
	
	static int[] removeDuplicate(int[] arr) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j] && arr[i]!=Integer.MIN_VALUE) {
					arr[j]=Integer.MIN_VALUE;
					count++;
				}
			}
		}
		
		int size=arr.length-count,a=0;
		int[] arr1 = new int[size];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=Integer.MIN_VALUE) 
				arr1[a++]=arr[i];	
		}
		return arr1;
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
		int[] arr1 = new int[] {1,1,1,4,4,5,6,5,8,9};
		int element = 5;
		arr=removeElement(arr,element);
		arr1=removeDuplicate(arr1);
		
		for (int j = 0; j < arr1.length; j++) {
			System.out.print(arr1[j]+" ");
		}

		System.out.println();
		
	}
}

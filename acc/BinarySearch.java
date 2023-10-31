package acc;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		int s =0;
		int e =arr.length-1;
		int mid =0;
		int itr=0;
		while(s<=e) {
			itr++;
			mid=(s+e)/2;
			if(arr[mid]==19) {
				System.out.println("element found at "+mid);
				System.out.println("Iterations "+itr);
				return;
			}	
			if(arr[mid]>19)
				e=mid-1;
			else
				s=mid+1;
				
		}
	}
}

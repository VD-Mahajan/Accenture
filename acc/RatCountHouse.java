package acc;

public class RatCountHouse {

	static int houses(int rat,int unit,int[] arr) {
		int index=0,sum=0;
		if(arr==null) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
			if(sum>=rat*unit) {
				index=i+1;
				break;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {2,8,3,5,7,4,1,2};
		int houses = houses(7, 2,arr);
		System.out.println(houses);
	}
}

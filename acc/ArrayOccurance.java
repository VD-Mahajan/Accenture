package acc;
import java.io.*;

public class ArrayOccurance {
	static int occurance(int[] arr1, int[] arr2) {
		int a =0,count=0;
		boolean flag = false;
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i]==arr2[a]) {
				flag = true;
				a++;
			}else {
				a=0;
				flag=false;
			}
			if(flag==true && arr2.length-1 == a) {
				count++;
				a=0;
			}
		}
		return count;
	}
	
	public static void main(String[] args)throws InterruptedException,IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr1 = new int[8];
		int[] arr2 = new int[5];
		System.out.println("Enter array 1 elements : ");
		for(int i=0;i<8;i++) {
			arr1[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter array 2 elements : ");
		for(int i=0;i<5;i++) {
			arr2[i]=Integer.parseInt(br.readLine());
		}

		int ans = occurance(arr1,arr2);
		System.out.println("occurance : "+ans);
	}
	
}

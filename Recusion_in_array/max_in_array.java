package Recusion_in_array;

import java.util.Scanner;

public class max_in_array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[] =new int[n];
		for(int i=0;i<arr.length;++i) {
			arr[i]=s.nextInt();
		}
		int i=0;
		
		int max=maxOfArray(arr,i);
		System.out.println(max);

	}
	
	public static int maxOfArray(int arr[], int i) {
		
		if(i==arr.length) {
			return 0;
			
		}
		
		int max=maxOfArray(arr,i+1);
		if(max<arr[i]) {
			max=arr[i];
		}
		return max;
		
		
	}
	
	

}

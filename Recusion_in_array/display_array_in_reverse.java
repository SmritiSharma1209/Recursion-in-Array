package Recusion_in_array;

import java.util.Scanner;

public class display_array_in_reverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[] =new int[n];
		for(int i=0;i<arr.length;++i) {
			arr[i]=s.nextInt();
		}
		int i=arr.length-1;
		display_reverse(arr,i);
	}

	
	public static void display_reverse(int arr[], int i) {
		if(i<0) {
			return;
		}
		
		System.out.println(arr[i]);
		display_reverse(arr,i-1);
		
		
		
	}
}

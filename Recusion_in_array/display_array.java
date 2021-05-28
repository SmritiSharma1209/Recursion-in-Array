package Recusion_in_array;

import java.util.Scanner;

public class display_array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[] =new int[n];
		for(int i=0;i<arr.length;++i) {
			arr[i]=s.nextInt();
		}
		int i=0;
		display(arr,i);

	}
	
	public static void display(int arr[], int i) {
		if(i==arr.length) {
			return;
		}
		
		System.out.println(arr[i]);
		display(arr,i+1);
		
	}

}

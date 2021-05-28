package Recusion_in_array;

import java.util.Scanner;

public class first_index {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[] =new int[n];
		for(int i=0;i<arr.length;++i) {
			arr[i]=s.nextInt();
		}
		int idx=0;
		int x=s.nextInt();
		int firstIndex=firstIndex(arr,idx, x);
		System.out.println(firstIndex);
	}
	
	public static int firstIndex(int arr[], int idx, int x) {
		
		if(idx==arr.length) {
			return -1;
		}
		
		if(arr[idx]==x) {
			return idx;
		}
		
		int index=firstIndex(arr,idx+1,x);
		return index;
		
	}

}

package Recusion_in_array;

import java.util.Scanner;

public class last_index_in_array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[] =new int[n];
		for(int i=0;i<arr.length;++i) {
			arr[i]=s.nextInt();
		}
		int idx=arr.length-1;
		int x=s.nextInt();
		int lastindx=lastIndex(arr,idx,x);
		System.out.println(lastindx);
		

	}
	
	public static int lastIndex(int arr[], int idx, int x) {
		if(idx<0) {
			return -1;
		}
		
		if(arr[idx]==x) {
			return idx;
		}
		
		int lindex=lastIndex(arr, idx-1, x);
		return lindex;
		
	}

}

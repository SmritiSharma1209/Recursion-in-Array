package Recusion_in_array;

import java.util.Scanner;

public class Return_all_indices {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[] =new int[n];
		for(int i=0;i<arr.length;++i) {
			arr[i]=s.nextInt();
		}
		int x=s.nextInt();
		int idx=0;                   
		int fsf=0;       //found so far
		int indexArray[]=allIndicies(arr,x,idx,fsf);
		for(int i=0;i<indexArray.length;++i){
			System.out.println(indexArray[i]);
		}

	}
	
	public static int[] allIndicies(int arr[], int x, int idx ,int fsf) {
		
		
		if(idx==arr.length) {
			return new int[fsf];
		}
		
		
		if(arr[idx]==x) {
			int iarr[]=allIndicies(arr, x ,idx+1, fsf+1);
			iarr[fsf]=idx;
			return iarr;
			
		}
		else {
			int iarr[]=allIndicies(arr, x ,idx+1, fsf);
			return iarr;
			
		}
		
		
}

}

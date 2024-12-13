/*
 *	Author:  
 *  Date: 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int[] arr1 = {1,3,5,7,9,11,13};
		int[] arr2 = {2,4,6,8,10,12,14};

		int[] arr3 = {1,1,3,4,6,8,9,10};
		int[] arr4 = {2,2,3,5,7,8,11,12};

		int[] combined12 = new int[arr1.length + arr2.length];
		merge(combined12, arr1,arr2);

		int[] combined34 = new int[arr3.length + arr4.length];
		merge(combined34, arr3,arr4);


		System.out.println("Array 1:");
		printArr(arr1);
		System.out.println("Array 2:");
		printArr(arr2);
		System.out.println("Combined Array:");
		printArr(combined12);


		System.out.println("");
		System.out.println("Array 3:");
		printArr(arr3);
		System.out.println("Array 4:");
		printArr(arr4);
		System.out.println("Combined Array:");
		printArr(combined34);

	}

	// Write the merge method to merge 2 arrays into 1 correctly.
	public static void merge(int[] combined, int[] arr1, int[] arr2){
		int x =0;
		int y=0;
		int c =0;
		while (x<arr1.length&&y<arr2.length){
		if (arr1[x]>arr2[y]){
			combined[c]=arr2[y];
			c++;
			y++;
		}
		else {
			combined[c]=arr1[x];
			c++;
			x++;
		}
		}
		while (x<arr1.length){
		combined[c]=arr1[x];
		x++;
		c++;
		}
		while(y<arr2.length){
		combined[c]=arr2[y];
		y++;
		c++;
		}
		

	}

	public static void printArr(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

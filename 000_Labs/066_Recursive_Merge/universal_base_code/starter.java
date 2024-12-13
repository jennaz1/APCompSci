/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int[] arr = {1,5,2,3,4,7,10,9};
		mergeSort(arr);
		for (int i =0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}



	}
	public static void mergeSort(int[] arr){
		int length = arr.length;
		int leftArrLength = length/2;
		int rightArrLength = length-leftArrLength;
		int[] leftArr = new int[leftArrLength];
		for (int i =0; i<leftArrLength;i++){
			leftArr[i]=arr[i];
		}
		int[] rightArr = new int[rightArrLength];
		for (int i =0; i<rightArrLength;i++){
			rightArr[i]=arr[i+leftArrLength];
		}
		int[] combinedArr = new int[length];
		if (arr.length==1){
			return;
		}
		else{
		mergeSort(leftArr);
		mergeSort(rightArr);
		merge(combinedArr,leftArr,rightArr);
		}
		for (int i=0; i<combinedArr.length;i++){
			arr[i]=combinedArr[i];
		}
		
	}
	private static void merge(int[] combined, int[] x, int[] y ){
		int l=0;
		int r =0;
		int c=0;
		while(l<x.length&&r<y.length){
		if (x[l]>y[r]){
			combined[c]=y[r];
			r++;
			c++;
			
		}
		else {
			combined[c]=x[l];
			l++;
			c++;
		}
		}
		while(l<x.length){
			combined[c]=x[l];
			l++;
			c++;
		}
		while(r<y.length){
			combined[c]=y[r];
			r++;
			c++;
			
		}
		
	}
}

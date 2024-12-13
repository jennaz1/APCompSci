/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int[] arr = new int[200];
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*200+1);
		}
		
	for (int x=0; x<arr.length-1;x++){	
		for (int i=0;i<arr.length-x-1;i++){
			if (arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
	}
	for (int i=0; i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}


	}
}

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
		arr[0]=1;
		for(int i=1;i<arr.length;i++){
			arr[i]=(int)(Math.random()*200+1);
		}
		for (int x=0; x<arr.length; x++){
			int min = Integer.MAX_VALUE;
			int min_index=x;
		for (int i=x; i<arr.length;i++){
			if (arr[i]<arr[min_index]){
				min_index = i;
			}
			
			int temp = arr[x];
			arr[x]=arr[min_index];
			arr[min_index]=temp;
			
		}
	}
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}



	}
}

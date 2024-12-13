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
		for (int i=1; i<arr.length;i++){
			int x =1;

			while (i - x >= 0 && arr[i]<arr[i-x] ){
				int temp =arr[i];
				arr[i]=arr[i-x];
				arr[i-x]=temp;
				i--;
				
			}
			
		}
		for (int i =0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}



	}
}

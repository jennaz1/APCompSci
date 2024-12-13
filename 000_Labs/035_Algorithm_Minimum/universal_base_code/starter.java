/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int randSize = (int)(51+Math.random()*250);
		int[] arr = new int[randSize];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int rn = 0;
		for (int i=0; i<randSize;i++){
			arr[i]=(int)(1+Math.random()*100);
			if (arr[i]<min){
				min = arr[i];
			}
			if (arr[i]>max){
				max = arr[i];
			}
			rn+=arr[i];
			
		}
		System.out.println("There are "+randSize+" elements");
		System.out.println("The maximum of 100 random numbers is: "+max);
		System.out.println("The minumum of 100 random numbers is: "+min);
		System.out.println("The average of 100 random numbers is: "+(rn/randSize));

		
	}
}

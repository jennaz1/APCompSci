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
		int[][] arr = new int[2][3];
		double sum=0;
		for (int r=0; r<arr.length;r++){
			for (int c=0; c<arr[0].length;c++){
				arr[r][c]=(int)(1+Math.random()*5);
				System.out.print(arr[r][c]);
				sum+=arr[r][c];
			}
			System.out.println();
		}
		System.out.println(sum/(arr.length*arr[0].length));
	}
}

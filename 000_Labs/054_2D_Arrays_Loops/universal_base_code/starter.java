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
		Scanner sc = new Scanner(System.in);
		System.out.println("Row: ");
		int row = sc.nextInt();
		System.out.println("Column: ");
		int column = sc.nextInt();
		int[][] arr = new int[row][column];
		for (int r =0;r<row;r++){
			for(int c=0; c<column;c++){
				arr[r][c]=(int)(1+Math.random()*10);
			}
		}
		
		printAll(arr);
		System.out.println("What number of row do you want to get the average of? ");
		int rowNum = sc.nextInt();
		rowAverage(rowNum-1,arr);
		totalAverage(arr);

		
	}
	public static void printAll(int[][] x){
		for (int i=0;i<x.length;i++){
			for(int f=0;f<x[0].length;f++){
				System.out.print(x[i][f]+" ");
			}
			System.out.println();
		}
	}

	public static void rowAverage(int y,int[][] x){
		double sum=0;
		for(int r=0;r<x[0].length;r++){
			sum+=x[y][r];
			
		}
		System.out.println(sum/x[0].length);
	}
	
	public static void totalAverage(int[][] x){
		double sum =0;
		for (int r=0;r<x.length;r++){
			for(int c=0;c<x[0].length;c++){
				sum+=x[r][c];
			}
		}
		System.out.println("Average of all values within the array is: "+sum/(x.length*x[0].length));
}
}

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
		System.out.println("What symbol would you like to use? ");
		String symbol = sc.nextLine();
		System.out.println("What's the width of your box? ");
		int width=sc.nextInt();
		System.out.println("What's the height of your box? ");
		int height=sc.nextInt();
		for(int x=0; x<height; x++){
		for (int i=0; i<width;i++){
			System.out.print(symbol+" ");
		}
		System.out.println();


		}
	}
}

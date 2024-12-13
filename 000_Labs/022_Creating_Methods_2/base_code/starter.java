/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int x, int y){
		return (int)Math.pow(x,y);
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int x = sc.nextInt();
		System.out.print("Enter an integer: ");
		int y=sc.nextInt();
		System.out.print("The result is: " + pow(x,y));



		
	}
}

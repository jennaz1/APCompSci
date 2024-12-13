/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		int num = (int)(1001*Math.random());
		System.out.print("Guess a number from 1-1000: ");
		int guess = sc.nextInt();
		while (guess != num){
			System.out.println("Keep guessing: ");
			guess = sc.nextInt();
			if (guess == num){
				System.out.print("You win!");
				break;
			}
		}



		
	}
}

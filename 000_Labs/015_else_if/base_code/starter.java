/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		int num = 1000*(int)(Math.random());
		System.out.print("Guess a number between 1 and 1000: ");
		int guess = sc.nextInt();
		if (num==guess){
			System.out.print("You are correct");
		} 
		else if (guess>num){
			System.out.print("Your number is too high");
		}
		else if(guess<num){
			System.out.print("Your number is too low");
		}
		else{
			System.out.print("Error");
		}
	}
}

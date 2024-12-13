/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a integer: "); 
		int number1=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter a integer: ");
		int number2=sc.nextInt();
		sc.nextLine();
		if (number1 != number2){
			System.out.print("These numbers are different");
		}
		if (number1 == number2){
			System.out.print("These numbers are the same");
		}
		
	}
}

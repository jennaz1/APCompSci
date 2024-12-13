/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a integer: ");
		int number1=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter another integer: ");
		int number2=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter a new integer: ");
		int number3=sc.nextInt();
		sc.nextLine();
		if ((number1>number2)&&(number1>number2)){
			System.out.println(number1+" is the largest number");
		}
		if ((number2>number1)&&(number2>number3)){
			System.out.println(number2+" is the largest number");
		}
		if ((number3>number2)&&(number3>number1)){
			System.out.println(number3+" is the largest number");
		}
		if ((number1<number2) && (number1<number3)){
			System.out.println(number1 + " is the smallest number");
		}
		if ((number2<number1) && (number2<number3)){
			System.out.println(number2 + " is the smallest number");
		}
		if ((number3<number2) && (number3<number1)){
			System.out.println(number3 + " is the smallest number");
		}
		
		
	}
}

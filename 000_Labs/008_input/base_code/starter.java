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
		System.out.println("What is your first name? "); 
		var firstName=sc.nextLine();
		
		System.out.println("What is your age? ");
		var age=sc.nextInt();
		sc.nextLine();
		
		System.out.println("What month is your birthday in? ");
		var month=sc.nextLine();
		
		System.out.println("What is the day of your birthday? ");
		var day=sc.nextInt();
		sc.nextLine();
		
		System.out.println("What is the year of your birthday? ");
		var year=sc.nextInt();
		sc.nextLine();
		
		System.out.println("How much is a buck fifty? ");
		var buck=sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Your name is " + firstName + " and you are " + age+ " years old. Your birthday is " + month + " " + day + " " + year+ ". A buck fifty is $"+buck+".");
	}
}

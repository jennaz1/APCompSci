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
		Scanner sc=new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, Rogue?");
		String role = sc.nextLine();
	if (role.equals("wizard")
	||role.equals("warrior")||
	role.equals("rogue")){
		System.out.print(role);
	} else{
		System.out.print("Please only choose wizard, warrior, or rogue! ");
	}
}
}
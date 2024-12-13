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
		myCharacter bob = new myCharacter();
		bob.myToString();
		System.out.println("What class would you like to be? wizard, warrior, or rogue");
		String role = sc.nextLine().toLowerCase();
		bob.role=role;
		if (role.equals("wizard")){
			System.out.println("You chose wizard! Excelsior!");
			bob.myToString();
		}
		else if (role.equals("warrior")){
			System.out.println("You chose warrior! For honor!");
			bob.myToString();
			
		}else if (role.equals("rogue")){
			System.out.println("You chose rogue! How cunning!");
			bob.myToString();
		}else{
			System.out.println("Please only choose wizard, warrior, or rogue ");
			bob.myToString();
		}



		
	}
}

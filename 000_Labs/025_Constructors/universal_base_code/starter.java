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
		System.out.println("Your role is "+bob.role);
		System.out.println("Your Strength is "+bob.Strength);
		System.out.println("Your Dexterity is "+bob.Dexterity);
		System.out.println("Your Intelligence is "+bob.Intelligence);
		System.out.println("Your Charisma is "+bob.Charisma);
		System.out.println("What class would you like to be? wizard, warrior, or rogue");
		String role = sc.nextLine().toLowerCase();
		if (role.equals("wizard")){
			System.out.println("You chose wizard! Excelsior!");
			System.out.println("Your role is "+role);
			System.out.println("Your Strength is "+bob.Strength);
			System.out.println("Your Dexterity is "+bob.Dexterity);
			System.out.println("Your Intelligence is "+bob.Intelligence);
			System.out.println("Your Charisma is "+bob.Charisma);
		}
		else if (role.equals("warrior")){
			System.out.println("You chose warrior! For honor!");
			System.out.println("Your role is "+role);
			System.out.println("Your Strength is "+bob.Strength);
			System.out.println("Your Dexterity is "+bob.Dexterity);
			System.out.println("Your Intelligence is "+bob.Intelligence);
			System.out.println("Your Charisma is "+bob.Charisma);
			
		}else if (role.equals("rogue")){
			System.out.println("You chose rogue! How cunning!");
			System.out.println("Your role is "+role);
			System.out.println("Your Strength is "+bob.Strength);
			System.out.println("Your Dexterity is "+bob.Dexterity);
			System.out.println("Your Intelligence is "+bob.Intelligence);
			System.out.println("Your Charisma is "+bob.Charisma);
		}else{
			System.out.println("Please only choose wizard, warrior, or rogue ");
			System.out.println("Your role is "+bob.role);
			System.out.println("Your Strength is "+bob.Strength);
			System.out.println("Your Dexterity is "+bob.Dexterity);
			System.out.println("Your Intelligence is "+bob.Intelligence);
			System.out.println("Your Charisma is "+bob.Charisma);
		}

		
	}
}

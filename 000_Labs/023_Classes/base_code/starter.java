/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class character{
	String role = "wizard";
	int Strength = 8;
	int Dexterity = 9;
	int Intelligence = 4;
	int Charisma = 3;
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		character bob = new character();
		System.out.println("Your role is "+bob.role);
		System.out.println("Your Strength is "+bob.Strength);
		System.out.println("Your Dexterity is "+bob.Dexterity);
		System.out.println("Your Intelligence is "+bob.Intelligence);
		System.out.println("Your Charisma is "+bob.Charisma);



	}
}

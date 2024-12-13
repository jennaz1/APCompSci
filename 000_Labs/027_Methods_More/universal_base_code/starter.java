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
		System.out.println("What class would you like to be? wizard, warrior, or rogue");
		String role = sc.nextLine().toLowerCase();
		myCharacter bob = new myCharacter();
		bob.role=role;
		bob.setRole();
		System.out.println("How many points would you like to spend on Strength?");
		int Strength = sc.nextInt();
		bob.Strength = Strength;
		bob.setStrength();
		System.out.println("How many points would you like to spend on Dexterity?");
		int Dexterity = sc.nextInt();
		bob.Dexterity = Dexterity;
		bob.setDexterity();
		System.out.println("How many points would you like to spend on Intelligence?");	
		int Intelligence = sc.nextInt();
		bob.Intelligence = Intelligence;
		bob.setIntelligence();
		System.out.println("How many points would you like to spend on Charisma?");
		int Charisma = sc.nextInt();
		bob.Charisma = Charisma;
		bob.setCharisma();

		
	}
}

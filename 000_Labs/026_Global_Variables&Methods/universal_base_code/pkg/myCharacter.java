/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String role;
	public int Strength;
	public int Dexterity;
	public int Intelligence;
	public int Charisma;
	public void myToString(){
		System.out.println("Your role is "+role);
		System.out.println("Your Strength is "+Strength);
		System.out.println("Your Dexterity is "+Dexterity);
		System.out.println("Your Intelligence is "+Intelligence);
		System.out.println("Your Charisma is "+Charisma);
	}

		public myCharacter(){
		role = "No role";
		Strength = 0;
		Dexterity=0;
		Intelligence=0;
		Charisma = 0;
		}

}


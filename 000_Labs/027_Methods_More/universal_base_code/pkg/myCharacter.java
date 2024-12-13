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
		

		
	public void setRole(){	
		if (role.equals("wizard")){
			System.out.println("You chose wizard! Excelsior!");
			myToString();
		}
		else if (role.equals("warrior")){
			System.out.println("You chose warrior! For honor!");
			myToString();
			
		}else if (role.equals("rogue")){
			System.out.println("You chose rogue! How cunning!");
			myToString();
		}else{
			role = "no role";
			System.out.println("Please only choose wizard, warrior, or rogue ");
			myToString();
		}
	}
	
	public void setStrength(){
		if (Strength>0){
			System.out.println("Your strength is "+Strength);
		} else {
			Strength = 0;
			System.out.println("Your strength is "+Strength);
		}
	}
	
	public void setDexterity(){
		if (Dexterity>0){
			System.out.println("Your dexterity is "+Dexterity);
		} else {
			Dexterity = 0;
			System.out.println("Your dexterity is "+Dexterity);
		}
	}
	
	public void setIntelligence(){
		if (Intelligence>0){
			System.out.println("Your Intelligence is "+Intelligence);
		} else {
			Intelligence = 0;
			System.out.println("Your Intelligence is "+Intelligence);
		}
	}
	
	public void setCharisma(){
		if (Charisma>0){
			System.out.println("Your Charisma is "+Charisma);
		} else {
			Charisma = 0;
			System.out.println("Your Charisma is "+Charisma);
		}
	}
	

	

	public myCharacter() {
		role = "No role";
		Strength = 0;
		Dexterity=0;
		Intelligence=0;
		Charisma = 0;
		
	}

}


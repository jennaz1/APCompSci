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
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your character name? ");
		String name = sc.nextLine();
		System.out.print("What is your title? ");
		String title = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, Rogue?");
		String role = (sc.nextLine()).toLowerCase(); 
	if (role.equals("wizard")||
	role.equals("warrior")||
	role.equals("rogue")){
		System.out.println("Hello, "+role+" "+name+"\n");
	} else{
		System.out.print("Please only choose wizard, warrior, or rogue! ");
	}
		int points = 20;
	System.out.println("You have "+points+ " points to spend on traits!\nDo you want to purchase for points:\nStrength - Buff and able to carry larger items\nDexterity - Agile and moves quick\nIntelligence - Better at magic spells\nCharisma - How personable ");

	System.out.print("Strength 1-10: ");
	int pointsDeduct = sc.nextInt();
	if (pointsDeduct>10) {
		System.out.println("Please enter a maximum of 10 points");
		pointsDeduct = sc.nextInt();
		System.out.println("You have "+(points-=pointsDeduct)+" left to spend!");
	} else if (pointsDeduct>points){
		System.out.println("Please enter a number less than or equal to "+points);
		pointsDeduct = sc.nextInt();
		System.out.println("You have "+(points-=pointsDeduct)+" left to spend!");
	} else {
	System.out.println("You have "+(points-=pointsDeduct)+" left to spend!");
	}
	
	
	System.out.println("Dexterity 1-10: ");
	int pointsDeduct1 = sc.nextInt();
	if(pointsDeduct>10){
		System.out.println("Please enter a maximum of 10 points");
		pointsDeduct1 = sc.nextInt();
		System.out.println("You have "+(points-=pointsDeduct1)+" left to spend!");
	}
	else if (pointsDeduct1>points){
		System.out.println("Please enter a number less than or equal to "+points);
		System.out.print("Strength 1-10: ");
		pointsDeduct1 = sc.nextInt();
		System.out.println("You have "+(points-=pointsDeduct1)+" left to spend!");
	} else {
	System.out.println("You have "+(points-=pointsDeduct1)+" left to spend!");
	}
	
	
	System.out.println("Intelligence 1-10: ");
	int pointsDeduct2 = sc.nextInt();
	if (pointsDeduct>10){
		System.out.println("Please enter a maximum of 10 points");
		pointsDeduct2 = sc.nextInt();
		System.out.println("You have "+(points-=pointsDeduct2)+" left to spend!");
	}
	else if (pointsDeduct2>points){
		System.out.println("Please enter a number less than or equal to "+points);
		pointsDeduct2 = sc.nextInt();
		System.out.println("You have "+(points-=pointsDeduct2)+" left to spend!");
	} else {
	System.out.println("You have "+(points-=pointsDeduct2)+" left to spend!");
	}
	
	
	System.out.println("Charisma 1-10: ");
	int pointsDeduct3 = sc.nextInt();
	if(pointsDeduct3>10){
		System.out.println("Please enter a maximum of 10 points");
		pointsDeduct3 = sc.nextInt();
		System.out.println("You have "+(points-=pointsDeduct3)+" left to spend!");
	}
	else if (pointsDeduct3>points){
		System.out.println("Please enter a number less than or equal to "+points);
		pointsDeduct3 = sc.nextInt();
		System.out.println("You have "+(points-=pointsDeduct3)+" left to spend!");
	} else {
	System.out.println("You have "+(points-=pointsDeduct3)+" left to spend!");
	}

	
	System.out.print("\nRole: "+role+"\nName: "+name+"\nTitle:"+title+"\nPoints left: "+points+"\nStrength: "+pointsDeduct+"\nDexterity: "+pointsDeduct1+"\nIntelligence: "+pointsDeduct2+"\nCharisma: "+pointsDeduct3);
		
}
}

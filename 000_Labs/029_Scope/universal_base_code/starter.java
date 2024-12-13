/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Donkey donkey = new Donkey();
		Ogre shrek = new Ogre();
		int j=0;
		if(shrek.isUgly()){
			String statement = new String(shrek.name + " IS UGLY!");
		
		System.out.println(statement);
		donkey.interact(shrek);
		for( int i = 0; i < 5; i++){
			shrek.interact(donkey);
			j++;
		}
		System.out.println("That printed out " + j + " times");
//
	}
}
}

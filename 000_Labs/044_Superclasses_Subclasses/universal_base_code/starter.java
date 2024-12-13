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
		superclass performer = new superclass();
		superclass performer2 = new superclass("Adele",36);
		musicianSubclass musician = new musicianSubclass();
		musicianSubclass musician2 = new musicianSubclass("Beethoven");
		performer.getName();
		performer.practice();
		performer2.getName();
		performer2.perform();
		musician.getName();
		musician.perform();
		musician.playInstrument();
		musician2.practice();
		musician2.getInstrument();
		musicianSubclass musician3 = new musicianSubclass("Bruno Mars","guitar");
		musicianSubclass musician4 = new musicianSubclass("Dwayne Johnson",9,"coconuts");
		musician3.getName();
		musician3.practice();
		musician3.getInstrument();
		musician4.getName();
		musician4.perform();
		musician4.playInstrument();
		actor actor1 = new actor();
		actor1.practice();
		actor1.perform();
		actor1.monologue();
		apprentice apprentice1 = new apprentice();
		apprentice apprentice2 = new apprentice("USC", 8);
		apprentice apprentice3 = new apprentice("piano", "UCLA", 5);
		apprentice apprentice4 = new apprentice("Jack", 5, "cookie","Incredibles",5);
		apprentice1.playInstrument();
		apprentice2.practice();
		apprentice3.perform();
		apprentice4.practiceAtUniversity();
		superclass[] performers = new superclass[4];
		performers[0] = new superclass();
		performers[1] = new musicianSubclass();
		performers[2]=new apprentice();
		performers[3]=new actor();
		performers[0].perform();
		performers[0].practice();
		performers[1].perform();
		performers[1].practice();
		performers[2].practiceAtUniversity();
		performers[2].playInstrument();
		performers[3].monologue();
		performers[3].perform();
		for (int i =0; i<4;i++){
			System.out.println(performers[i].toString());
		}
		if (performers[1].equals(performers[2])){
			System.out.println("They are the same");
		} else{
			System.out.println("They are not equal");
		}
		

		



		
	}
}

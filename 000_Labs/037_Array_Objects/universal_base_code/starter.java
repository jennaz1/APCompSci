/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Warrior[] warrior = new Warrior [100];
		Wizard[] wizard = new Wizard [100];
		int x = 0;
		while (x<100){
			wizard[x]=new Wizard();
			warrior[x]=new Warrior();
			x++;
		}
				
		int i=0;
		int a=0;
	
		while (warrior[99].isDead()==false&&wizard[99].isDead()==false){
			wizard[i].attack(warrior[a]);
			
			if (warrior[a].isDead()==true){
				if (a<100){
					a++;
				}
			}
			
			warrior[a].attack(wizard[i]);
			if (wizard[i].isDead()==true){
				if (i<100){
					i++;
				}
			}
			
		}
		if (warrior[99].isDead()==true){
				System.out.print("Wizards won with "+(99-i)+" remaining");
			
			} else if (wizard[99].isDead()==true){
				System.out.print("Warriors won with "+(99-a)+" remaining");
		
			}

	}
}

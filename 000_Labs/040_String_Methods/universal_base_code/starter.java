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
	System.out.println("Enter a first name and last name with a space in the middle.");
	String name = sc.nextLine();
	int space = name.indexOf(" ");
	System.out.print("The last name is: "+name.substring(space+1));

		
	}
}

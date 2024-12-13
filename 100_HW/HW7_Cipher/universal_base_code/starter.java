/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter a message you want to decipher:\n");
	String message=sc.nextLine();
	System.out.println("Is there a key? (y/n)");
	String condition = sc.nextLine();
	if (condition.equals("n")){
		System.out.println(Cipher.encode(message));
	} else if (condition.equals("y")){
		System.out.println("What is the key?");
		int key = sc.nextInt();
		System.out.println(Cipher.keyedEncode(message,key));
		//for (int i = 1; i<37;i++){
		//System.out.println(Cipher.keyedEncode(message,i));
	//}
	} else {
		System.out.print("Try again");
	}
	
		

	}
	
	
}

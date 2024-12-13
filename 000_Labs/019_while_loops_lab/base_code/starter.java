/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name = sc.nextLine();
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int c=0;
		while (c<num){
			System.out.println(name);
			c+=1;
		}


		
	}
}

/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What day is it?\nSunday=0\nMonday=1\nTuesday=2\nWednesday=3\nThursday=4\nFriday=5\nSaturday=6\nEnter: ");
		int input = sc.nextInt();
		
		if (input == 1 || input == 2 || input == 3 || input==4||input==5){
			System.out.print("Wake up at 7:00am");
		} 
		else if (input==0 || input==6){
			System.out.print("Wake up at 10:00am");
	}
}
}

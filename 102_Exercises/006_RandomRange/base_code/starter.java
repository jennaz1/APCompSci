/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("Enter two numbers to create a range for your random number\nPlease enter an integer: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter another integer (greater than the first): ");
		double num2 = sc.nextDouble();
		System.out.print("Your range is "+num1+" and "+num2+"\n");
		int rand=(int)((num2-num1)*Math.random()+num1);
		int rand1=(int)((num2-num1)*Math.random()+num1);
		int rand2=(int)((num2-num1)*Math.random()+num1);
		int rand3=(int)((num2-num1)*Math.random()+num1);
		int rand4=(int)((num2-num1)*Math.random()+num1);
		System.out.print("Here are five numbers generated in that range: "+rand+","+rand1+","+rand2+","+rand3+","+rand4);
	}
}

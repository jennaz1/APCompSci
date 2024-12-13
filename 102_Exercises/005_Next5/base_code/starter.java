/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double num1 = sc.nextDouble();
		int num=(int)num1;
		System.out.println("Here are the next five numbers: ");
		System.out.println(num+","+(num+1)+","+(num+2)+","+(num+3)+","+(num+4)+","+(num+5));
		System.out.println("Here are the next 5 multiples of "+num+"\n"+num+","+(num*2)+","+(num*3)+","+(num*4)+","+(num*5));
		System.out.println("Here is "+num+" divided by 100\n"+(num1/100));
		System.out.println("Here is "+num+"divided by 10\n"+(num1/10));
		


	}
}

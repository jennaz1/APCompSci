/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter another integer: ");
		double num2=sc.nextDouble();
		if ((num1%2)==0){
			System.out.println(num1+" is even");
		}
		else{
			System.out.println(num1+" is odd");
		}
		if ((num2%2)==0){
			System.out.println(num2+" is even");
		}
		else{
			System.out.println(num2+" is odd");
		}
	
		if(((num1%3==0)&&(num1%4==0)&&(num1%5==0))){
			System.out.println(num1+" is divisible by 3,4,and 5");
		} else{
			System.out.println(num1+" is not divisible by 3, 4, and 5");
		}
	
		if((num2%3==0)&&(num2%4==0)&&(num2%5==0)){
			System.out.println(num2+" is divisible by 3,4,and 5");
		} else{
			System.out.println(num2+" is not divisible by 3, 4, and 5");
		}
	}
}

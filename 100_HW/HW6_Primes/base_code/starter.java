/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a number: ");
	  int num = sc.nextInt();
	  printPrimes(num);
	  
	}
	public static boolean checkPrime(int num){
		for (int start=2;start<num;start++){
			if ((num%start)==0){
				return false;
			}
			}
			return true;
		}
		
		
	public static void printPrimes(int num){
		for(int x = 2; x<num;x++){
			if(checkPrime(x)){
				System.out.println(x);
			}
		}
	}
	}

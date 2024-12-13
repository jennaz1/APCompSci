/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		System.out.println(factorial(4));
		System.out.print(recurPower(2,3));
		
		}
		public static int factorial(int x){
			if (x==1){
				return 1;
			}
			return x*factorial(x-1);
		}
		public static int recurPower(int base, int n){
			if (n == 0){
				return 1;
			}
			return base*recurPower(base,n-1);
			
		}
		


	}

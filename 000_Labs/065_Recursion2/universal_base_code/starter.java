/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc =new Scanner(System.in);
		System.out.print("Input: ");
		int num = sc.nextInt();
		System.out.println("Output: \nFibonacci series of "+num+" numbers is: ");
		for (int i =0;i<num;i++){
		System.out.print(fibRecur(i)+" ");
	}


	}
	public static int fibRecur(int n){
		if (n==0){
			return 0;
		}
		if (n==1){
			return 1;
		}
		return fibRecur(n-1)+fibRecur(n-2);
		
	}
}

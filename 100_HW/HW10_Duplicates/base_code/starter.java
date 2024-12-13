/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int[] arr1 = new int[20];
		int target = (int)(Math.random()*10+1);
		System.out.println("target number: "+target);
		int dup = 0;
		for (int i=0; i<20;i++){
			arr1[i]=(int)(Math.random()*10+1);
			if (arr1[i]==target){
				System.out.println("index where "+target+" occured: "+i);
				dup++;
			}
		}
		System.out.println("number of duplicates of "+target+": "+dup);
		for (int i=0; i<19;i++){
			if (arr1[i]==arr1[i+1]){
				System.out.println("consecutive index: "+i+", "+(i+1)+": "+arr1[i]);
			}
		}

	

	}
}

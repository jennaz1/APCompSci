/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("Enter a sentence: ");
		String phrase = sc.nextLine();
		String sum = "";
		String last="";
		int nSpaceIndex=phrase.length();
		int spaceIndex = phrase.length();
		while (spaceIndex>0){
			spaceIndex = phrase.lastIndexOf(" ", spaceIndex-1);
			if (spaceIndex==-1){
				last = (phrase.substring(0,nSpaceIndex));
				break;
			} else{
			String word = phrase.substring(spaceIndex+1,nSpaceIndex);
			
			nSpaceIndex = spaceIndex;

			sb.append(word).append(" ");
			}
			
		}
			System.out.println(sb+last);

		}

}
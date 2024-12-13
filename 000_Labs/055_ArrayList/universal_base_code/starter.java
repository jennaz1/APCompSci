/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;
class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		ArrayList <String> cookies = new ArrayList<String>();
		int num = 1;
		while (true){
		System.out.println("What would you like your #"+num+" cookie to be?: ");
		 cookies.add(num-1,sc.nextLine());
		 num++;
		System.out.println("Would you like a another cookie? (yes/no)");
		 String ifso = sc.nextLine();
		 if (ifso.equals("no")){
		 	for(int i=0;i<cookies.size();i++){
		 		System.out.println("Cookie #"+(i+1)+": "+cookies.get(i));
		 	}
		 	break;
		 }
		
		}



	}
}

/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<String> arr2 = new ArrayList<String>();
		addValuesInt(arr1, 10);//ten random values 0-9
		addValuesString(arr2, 10);//ten random strings
		printValuesInt(arr1);//prints all values of integer array
		System.out.println();//space
		printValuesString(arr2);//prints all values of string array
		System.out.println();

		searchArrInt(arr1, 5);
		searchArrString(arr2, "apple");
		
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(new Integer((int)(Math.random()*10)));//0-9 random for ten indexes
		}
	}

	public static void addValuesString(ArrayList<String> arr, int num){
		for(int i = 0; i < num; i++){
			int rand = (int)(Math.random()*4);
			if(rand == 0)
				arr.add(new String("potato"));
			else if(rand == 1)
				arr.add(new String("apple"));
			else if(rand == 2)
				arr.add(new String("banana"));
			else if(rand == 3)
				arr.add(new String("orange"));
				//random string for num numbers
		}
			
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	public static void printValuesString(ArrayList<String> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	public static void searchArrInt(ArrayList<Integer> arr, int desiredInt){
		int x =0;
		for (int i=0; i<arr.size(); i++){
			if (arr.get(i)==desiredInt){
				System.out.println("Yes, "+desiredInt+" occured at index: "+i);
				x++;
			}
			
		}
		if (x==0){
			System.out.println("No, "+desiredInt+" never occured.");
		}

	}
	public static void searchArrString(ArrayList<String> arr, String desiredString){
		int x =0;
		for (int i=0; i<arr.size();i++){
			if (arr.get(i).equals(desiredString)){
				System.out.println("Yes, "+desiredString+" occured at index: "+i);
				x++;
			} 
			
		}
		if (x==0){
			System.out.println("No, "+desiredString+" never occured.");
		}

	}
	
}

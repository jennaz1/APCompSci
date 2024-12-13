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
		System.out.println("How many values in array?: ");
		int size = sc.nextInt();
		ArrayList <Integer> arr = new ArrayList<Integer>();
		for (int i =0;i<size;i++){
			arr.add(i,(int)(1+Math.random()*100));
		}
		toStringArrayList(arr);
		System.out.println("Max value: "+getArrayListMax(arr));
		System.out.println("Min value: "+getArrayListMin(arr));
		System.out.println("Average value: "+getArrayListAverage(arr));
	}
	public static void toStringArrayList(ArrayList<Integer> arr){
			for (int i=0; i<arr.size();i++){
				System.out.print(arr.get(i)+" ");
			}
			System.out.println();
		}
	public static int getArrayListAverage(ArrayList<Integer> arr){
		int sum=0;
		for(int i =0; i<arr.size();i++){
			sum+=arr.get(i);
		}
		return sum/arr.size();
	}
	public static int getArrayListMax(ArrayList<Integer> arr){
		int max = Integer.MIN_VALUE;
		for (int i =0;i<arr.size();i++){
			if(arr.get(i)>max){
				max=arr.get(i);
			}
		}
		return max;
	}
	public static int getArrayListMin(ArrayList<Integer> arr){
		int min = Integer.MAX_VALUE;
		for (int i =0;i<arr.size();i++){
			if(arr.get(i)<min){
				min=arr.get(i);
			}
		}
		return min;
	}
		
}

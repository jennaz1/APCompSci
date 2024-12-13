/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Dog name? ");
		String name1 = sc.nextLine();
		Dog dog1 = new Dog(name1);	
		System.out.println("Dog age? ");
		int age1=sc.nextInt();
		dog1.setAge(age1);
		System.out.println(dog1.getName()+" is a "+dog1.getBreed()+" that is "+dog1.getAge()+" years old");
		Dog dog2 = new Dog("bella","big orange dog");
		System.out.println(dog2.getName()+" is a "+dog2.getBreed()+" that is "+dog2.getAge()+" years old");
		
		if (dog1.isSleeping()){
			System.out.println(dog1.getName()+" is asleep");
			if(dog2.isSleeping()){
				System.out.println(dog2.getName()+" is asleep");
			} else{
				System.out.println(dog2.getName()+" is not sleeping");
			}
		} else{
			System.out.println(dog1.getName()+" is awake!");
			dog1.bark();
			System.out.println(dog2.getName()+" hears "+dog1.getName());
			dog2.bark();
		}	
		}
		



	}


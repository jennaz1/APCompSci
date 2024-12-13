/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class actor extends superclass {
	String type;
	String name;
	public actor() {
		type="theater";
	}
	public actor(String name, String type){
		
	}
	public void practice(){
		System.out.println(super.getName()+" practices very well");
	}
	public void perform(){
		System.out.println(super.getName()+" performs very badly");
	}
	public void monologue(){
		System.out.println("monologue...hahhahha...monologue");
	}

}


/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class actor {
	String type;
	public actor() {
		type="theater";
	}
	public actor(String name, String type){
		
	}
	public void practice(){
		System.out.println(this.name+" practices");
	}
	public void perform(){
		System.out.println(this.name+" performs");
	}
	public void monologue(){
		System.out.println("monologue");
	}

}


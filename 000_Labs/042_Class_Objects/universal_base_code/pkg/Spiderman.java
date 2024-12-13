/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class Spiderman {
	String name = "";
	int age =0;
	String villain="None";
	public Spiderman() {
		name = "Miles Morales";
		age = 13;
		villain = "King Pin";
	
	}
	public Spiderman(String n){
		name = n;
		age = 0;
		villain = "None";
	}
	public Spiderman(String n, int a){
		name = n;
		age = a;
		villain = "None";
	}
	public Spiderman(String n, String v){
		name=n;
		villain=v;
		age =0;
	}
	//methods
	public void setAge(int a){
		age = a;
	}
	public void setVillain(String v){
		villain = v;
	}
	public void print(){
		System.out.println("--------------------------------\nThe actor "+name+" is "+age+" years old.\nThey play Spiderman who's villain is "+ villain +".\n--------------------------------");
	}
}

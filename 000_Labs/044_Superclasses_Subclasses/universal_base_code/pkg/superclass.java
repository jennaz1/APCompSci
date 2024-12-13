/*
 *	Author:  
 *  Date: 
*/
package pkg;

import java.util.Scanner;
import java.util.Random;


public class superclass{
	int age;
	String name;
	public superclass() {
		name="Doja Cat";
		age = 26;
	}
	public superclass(String name, int age){
		this.name=name;
		this.age=age;
	}
	public superclass(String name){
		this.name = name;
		this.age = 26;
	}
	public String getName(){
		return name;
	}
	public void practice(){
		System.out.println(name+" is practicing");
	}
	public void perform(){
		System.out.println(name+" is performing");
	}
	public void practiceAtUniversity(){
		
	}
	public void playInstrument(){
		
	}
	public void monologue(){
		
	}
	public String toString(){
		return ("name: "+this.name+" age: "+this.age);
	}
	public boolean equals(Object other){
		return this.name.equals(((superclass)other).name);
	}

}


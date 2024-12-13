/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class CourseClass {
	String Teacher;
	int grade;
	int credit;
	

	public void calcCredit() {
		if (grade>=90){
			credit = 4;
		} else if (grade>=80){
			credit = 3;
		} else if (grade>=70){
			credit=2;
		}else if (grade>=60){
			credit=1;
		} else {
			credit=0;
		}
		
	}
	
	public String getTeacher(){
		return Teacher;
	}
	public String toString(){
		return("Teacher: "+Teacher+" Credit: "+credit);
	}
	public boolean equals(Object other){
		if (!(other instanceof CourseClass)){
			return false;
		}
		else{
			return this.Teacher.equals(((CourseClass)other).getTeacher());
		}
	}

}


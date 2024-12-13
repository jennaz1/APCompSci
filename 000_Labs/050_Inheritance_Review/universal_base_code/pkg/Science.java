package pkg;
import java.util.Scanner;
import java.util.Random;

public class Science extends CourseClass{
    String Field;
public Science(){
    Teacher = "bob";
}    
    public String toString(){
		return("Teacher: "+Teacher+" Credit: "+credit+" Field: "+Field);
	}
}
package pkg;
import java.util.Scanner;
import java.util.Random;

public class RecoverySci extends CourseClass{
    
    public void passOrFail(){
    if (grade>60){
        grade = 100;
    }
    else {
        grade=0;
    }
}


}
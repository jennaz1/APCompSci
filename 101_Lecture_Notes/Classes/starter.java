/* 
    Lecture note example - Classes
*/
import pkg.*;
import java.util.*;

class starter{
    public static void main(String args[]) {
        // Your Code Goes here!
        Potato fry =new Potato();
        Potato sp=new Potato("blue", "baked",100);
        System.out.println(fry.getEdibility());
        System.out.println(sp.getEdibility());
        sp.eatPotato();
	}
}
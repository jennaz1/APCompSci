
package pkg;
import java.util.Scanner;
import java.util.Random;

public class musicianSubclass extends superclass{
    String instrument;
    public musicianSubclass(){
        instrument = "Cello";
    }
    public musicianSubclass(String instrument){
        this.instrument = instrument;
    }
    public musicianSubclass(String name, String instrument){
        super(name);
        this.instrument = instrument;
    }
    public musicianSubclass(String name, int age, String instrument){
        super(name,age);
        this.instrument=instrument;
    }
    public String getInstrument(){
        return instrument;
    }
    public void playInstrument(){
        System.out.println("They play "+instrument);
    }
    public String toString(){
        return ("name: "+name+" instrument: "+instrument);
    }
    
    
    
}

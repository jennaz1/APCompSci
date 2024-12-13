package pkg;
public class apprentice extends superclass{
    String school;
    int yearsOfExperience;
    String instrument;
    public apprentice(){
        school = "CVHS";
        yearsOfExperience=0;
    }
    public apprentice(String school, int yearsOfExperience){
        this.school=school;
        this.yearsOfExperience=yearsOfExperience;
    }
    public apprentice(String instrument, String school, int yearsOfExperience){
        this.instrument=instrument;
        this.school = school;
        this.yearsOfExperience = yearsOfExperience;
    }
    public apprentice(String name, int age, String instrument, String school, int yearsOfExperience){
        this.name = name;
        this.age = age;
        this.instrument = instrument;
        this.school=school;
    }
    public void playInstrument(){
        System.out.println("They play the "+instrument);
    }
    public void practice(){
        super.practice();
        System.out.println("They have been practicing for "+yearsOfExperience+" years");
    }
    public void perform(){
        super.perform();
        System.out.println("They trip and fall on stage");
    }
    public void practiceAtUniversity(){
        super.practice();
        System.out.println("They are at "+this.school);
    }
    public String toString(){
        return ("name: "+name+" instrument: "+instrument+" university: "+school);
    }
    
    
}
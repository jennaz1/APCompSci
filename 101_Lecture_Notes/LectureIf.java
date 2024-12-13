/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;
class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("After eating too much rice for dinner, you are trapped within a mirror");
        System.out.println("Which path would you like to take in the mirror realm?\n1.The rice field where there is a Rice God who might grant you an escape\n2.A labyrinth of mirrors which might hold the escape route\n3.A magical kitchen where the Chef resides and he might grant you wishes");
	    int answer = sc.nextInt();
	    if (answer==1){
	        System.out.println("You step into the Rice Field, where the golden stalks glisten under a bright sky. As you wander through, you encounter the spirit of the Rice God, a wise and ancient figure with a gentle smile.\nThe Rice God speaks: “To escape, you must answer my riddle: ‘I can be long or short, I can be grown or cooked, but I’m always best with a little flavor. What am I?")
	        System.out.println("Your three options are 1. Time\n2. Rice\n3. Try to negotiate and find another way out");
	        int answer2 = sc.nextInt();
	        if (answer2==1){
	            System.out.print("The Rice God smirks slowly and takes out his rice satch and traps you inside his bag, making you slowly turn into rice yourself...");
	        }
	        else if (answer2==2){
	           
	        }
	        else if (answer2==3){
	            System.out.print("The Rice God smirks slowly and takes out his rice satch and traps you inside his bag, making you slowly turn into rice yourself...");
	        }
	        else{
	            System.out.print("The Rice God smirks slowly and takes out his rice satch and traps you inside his bag, making you slowly turn into rice yourself...");
	        }
	        
	        
	        
	    }
	    else if (answer==2){
	        System.out.println("As you enter the Hall of Reflections, you are surrounded by countless mirrors, each showing a different version of you. You notice some reflections seem to be trapped, while others appear free. You spot a glimmer in one of the mirrors and hear a voice: “Only the truest version of yourself can help you escape. Find the right reflection.");
	        
	        
	        
	        
	    }
	    else if (answer==3){
	        
	    }
	    else{
	        
	    }
	    
	    
	    
        
    }
}
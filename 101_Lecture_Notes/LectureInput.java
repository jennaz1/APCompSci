/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name=sc.nextLine();
        System.out.println("Hello "+name);
        System.out.println("Enter an integer: ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter another integer");
        int num2 = sc.nextInt();
        sc.nextLine();
 
        System.out.println("The sum of these numbers is "+(num1+num2));
        System.out.println("What is your favorite food: ");
        String food = sc.nextLine();
    
	}
}
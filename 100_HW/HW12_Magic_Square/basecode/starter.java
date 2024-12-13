import pkg.*;
//import java.util.Arrays;
import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of special squares you want to see: ");
		int num = sc.nextInt();
		CVMath.specialSquare(num);
	}
}

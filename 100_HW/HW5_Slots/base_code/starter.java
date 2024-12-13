/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		game();
		
	}
	
	public static void game(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules:\n1. Each player starts with $100.\n2. Input a wager less than your total amount of money.\n3. The slot machine will roll 3 numbers from 1 to 9.\na. If two numbers match, you double your money.\nb. If three numbers match, you triple your money.\nc. If none match, you lose your money.\n--------------------------------------------------");
		int totalMoney = 100;
		
		while (totalMoney > 0){
			int num1 = (int)(Math.random()*10);
			int num2 = (int)(Math.random()*10);
			int num3 = (int)(Math.random()*10);
			System.out.println("Would you like to play: (y,Y,yes,Yes)");
			String answer = sc.nextLine().toLowerCase();
			if (answer.equals("y")||answer.equals("yes")){
				System.out.println("How much money would you like to wager: ");
				int moneyIn = sc.nextInt();
				sc.nextLine();
				if (moneyIn <= 0 || moneyIn>totalMoney){
					System.out.println("Try again, input a number greater than zero and less than the amount you currently have");
				} else {
					totalMoney-=moneyIn;
					System.out.println("You rolled, |"+num1+"|"+num2+"|"+num3+"|");
					if (num1==num2 && num2 == num3) {
						totalMoney = moneyIn*3+totalMoney;
						System.out.println("Congratulations, you now have "+(totalMoney)+" dollars!");
					}else if (num1==num2||num2==num3||num1==num3){
						totalMoney = moneyIn*2+totalMoney;
						System.out.println("Congratulations, you now have "+(totalMoney)+" dollars!");
					} else {
						System.out.println("Better luck next time.. you have "+totalMoney+" dollars");
						
							
						} 
					}
				}
			
			
			else if (answer.equals("no")||answer.equals("n")){
					System.out.println("You have "+totalMoney+" dollars left. Have a good day!");
					break;
				} else{
					System.out.println("That wasn't quite the answer, try again.");
				}
		}
	}
	

	}

	


package Exercise2;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0 - Rock \n1 - Paper \n2 - Scissor");
		System.out.println("Enter Your Choice");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		case 0:
			System.out.println("Rock");
			break;
		case 1:
			System.out.println("Paper");
			break;
		case 2:
			System.out.println("Scissor");
			break;
		}
		
		Random pc = new Random();
		int randomValue = pc.nextInt(3);
		System.out.println("System Generated");
		System.out.println(randomValue);
		
		if (randomValue==0) {
			System.out.println("Rock");
		}
		else if (randomValue==1) {
			System.out.println("Paper");
		}
		else if (randomValue==2) {
			System.out.println("Scissor");
		}
		
		switch (choice) {
			case 0: if (randomValue ==0) {
						System.out.println("Game Tie");
					}
					else if (randomValue ==1) {
						System.out.println("System Wins");
		            }
					else if (randomValue ==2) {
						System.out.println("Player Wins");
				    }
				  break;
				  
			case 1: if (randomValue ==0) {
					System.out.println("Player Wins");
					}
					else if (randomValue ==1) {
						System.out.println("Game Tie");
					}
					else if (randomValue ==2) {
					System.out.println("System Wins");
					}
				break;
				
			case 2: if (randomValue ==0) {
					System.out.println("System Wins");
					}
					else if (randomValue ==1) {
					System.out.println("Player Wins");
					}
					else if (randomValue ==2) {
						System.out.println("Game Tie");
					}
				break;
		}

	}

}

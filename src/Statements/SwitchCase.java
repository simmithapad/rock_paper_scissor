package Statements;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age;
		System.out.println("Enter your age");
		age = sc.nextInt();
		
		switch(age){
			case 18: 
				System.out.println("You are a kid");
				break;
			case 23: 
				System.out.println("Have a job");
				break;
			case 30: 
				System.out.println("You are an Adult");
				break;
				default:
					System.out.println("Enjoy your life!");
		}

	}

}

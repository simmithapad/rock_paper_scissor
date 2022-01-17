package Statements;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age;
		
		System.out.println("Enter your age");
		
		age = sc.nextInt();
		
		if (age>50) {
			System.out.println("Mature");
		}
		else if (age <50) {
			System.out.println("Semi-Mature");
		}
		else {
			System.out.println("Hey Kiddo!");
		}
		
	}

}

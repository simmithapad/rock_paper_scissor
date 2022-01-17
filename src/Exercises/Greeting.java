package Exercises;

import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Type Your Name");
		String a= sc.next();
		System.out.println("Hello " + a + " Have A Good Day");
	}

}

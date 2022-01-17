package Exercises;

import java.util.Scanner;

public class FindPercentage {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int total = 500;
//		
//		System.out.println("Enter Marks of Physics");
//		int a = sc.nextInt();
//		
//		System.out.println("Enter Marks of Maths");
//		int b = sc.nextInt();
//		
//		System.out.println("Enter Marks of Chemistry");
//		int c = sc.nextInt();
//		
//		System.out.println("Enter Marks of English");
//		int d = sc.nextInt();
//		
//		System.out.println("Enter Marks of Fine Art");
//		int e = sc.nextInt();
//		float percentage = (float)(a + b + c + d + e)/total*100;
//		System.out.println(percentage);
		
		System.out.println("Enter Marks of Physics, Maths, Chemistry, English and Fine arts respectively");
		int a= sc.nextInt();
		for (int i=1; i<=5; i++) {
		if (a>100) {
			System.out.println("Error");
			}
		else {
			
			}
		float percentage = (a/total)*100;
		System.out.println(percentage);
	}
	}
}

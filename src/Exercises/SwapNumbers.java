package Exercises;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a= sc.nextInt();
		int b= sc.nextInt();
		
//		System.out.println("The value of a is:" + b);
//		System.out.println("The value of b is:" + a);
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println(a);
		System.out.println(b);
			
		    
		
		

	    
	}

}

package Exercises;

import java.util.Scanner;

public class StdIStdII {

	public static void main(String[] args) {
		
		
	        Scanner scan = new Scanner(System.in);
	        int i = scan.nextInt();
	        
	        double d = scan.nextDouble();
	        
	 // Always write sc.nextLine(); just after nextInt(); otherwise String will show blank space.
	        
	        scan.nextLine();
	        String s = scan.nextLine();

	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	    }

	}



package Exercises;

import java.util.*;

public class KmToMiles {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Type in Km");
		double a = sc.nextDouble();
		
		double mi= (double) 0.6213711; 
		
		double miles= a*mi;
		
		System.out.println(miles);
		
		
	}

}

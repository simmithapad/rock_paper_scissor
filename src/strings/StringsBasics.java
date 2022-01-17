package strings;

import java.util.Scanner;

public class StringsBasics {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = "Simmi Thapad";
		System.out.print("My Name Is: ");
		System.out.println(name);

		int a = 6;
		float b = 7.685f;
		System.out.printf("The value of a is %d and The value of b is %f" , a,b);
		
		/* Format Specifier : %d for Double
							  %f for float
							  %c for character
							  %s for string 
		*/
		System.out.format("The value of a is %d and The value of b is %f" , a,b);
		
		// System.out.printf is same as System.out.format
		
		String st = sc.next();
		System.out.println(st);
		
	}

}

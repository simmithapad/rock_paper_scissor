package strings;

import java.util.Scanner;

public class PracticeStrings {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		//Problem 1
		
		String name = "Simmi Thapad";
		name = name.toLowerCase();
		System.out.println(name);

		//Problem 2
		
		String text = "Hemlo People";
		System.out.println(text.replace(" ", "_"));
		
		//Problem 3
		
		String letter = "Dear <|name|>, Thanks a lot!";
		System.out.println(letter.replace("<|name|>", "Me"));
		
		//Problem 4
		
		String spaces = "This sentence contains  double and   triple spaces";
		System.out.println(spaces.indexOf("  "));
		System.out.println(spaces.indexOf("   "));
		
		//Problem 5
		
		String myletter = "Dear Harry,\n\tThis Java Course is nice.\nThanks";
		System.out.println(myletter);
	}

}

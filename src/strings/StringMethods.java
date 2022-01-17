package strings;

public class StringMethods {

	public static void main(String[] args) {
		
		//	.length
		
		String name = "Simmi Thapad";
		int value = name.length();
		System.out.println(value);
		
		//	.toLowerCase
		
		String lcase = name.toLowerCase();
		System.out.println(lcase);
		
		// .toUpperCase
		
		String ucase = name.toUpperCase();
		System.out.println(ucase);
		
		// .trim
		
		String nonTrimmedString = "    Simmi     Thapad   ";
		System.out.println(nonTrimmedString);
		
		System.out.println(nonTrimmedString.trim());
		
		// .subString
		
		String yes = "Thapad";
		System.out.println(yes.substring(1));
		System.out.println(yes.substring(1, 5));
		
		// .replace		
		
		System.out.println(yes.replace('a', 'r'));
//		System.out.println(yes.replace('pa', 'ert'));
		
		// .startswWith and .endsWith
		
		System.out.println(yes.startsWith("ha"));
		System.out.println(yes.endsWith("ad"));
		
		// .charAt
		
		System.out.println(yes.charAt(2));
		
		// .indexOf and .indexOf
		
		System.out.println(yes.indexOf("a"));
		System.out.println(yes.indexOf("a", 3));
		
		// .lastIndexOf
		
		System.out.println(yes.lastIndexOf("a"));
		System.out.println(yes.lastIndexOf("a", 3));
		
		// .equals
		
		System.out.println(yes.equals("Simmi"));
		
		// .equalsIgnoreCase
		
		System.out.println(yes.equalsIgnoreCase("thapad"));
		
		// Escape Sequence Character
		
		System.out.println("I am escape sequence \" double quote");
	}

}

package Exercises;

public class gradeEncryptDecrypt {

	public static void main(String[] args) {
		
		//Actual Grade
		
		char grade = 'A';
		grade = (char) (grade + 8);
		System.out.println(grade);
		
		//Decrypted Grade
		
		grade = (char)(grade - 8);
		System.out.println(grade);

	}

}

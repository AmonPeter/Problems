package tester;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner _scanner = new Scanner(System.in);
		
		System.out.println("Enter the string to be reversed: ");
		
		StringBuilder _stringBuilder = new StringBuilder(_scanner.nextLine());
		
		_scanner.close();
		
		System.out.println(_stringBuilder.reverse());
		
	}

}

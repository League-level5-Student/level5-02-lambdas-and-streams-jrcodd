package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((s) -> {
			for (int i = s.length() - 1; i >= 0; i--) {
				System.out.print(s.charAt(i));
			}
		}, "backwards");
		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			Random r = new Random();
			String output = "";
			char temp;
			for (int i = 0; i < s.length(); i++) {
				if (r.nextBoolean()) {
					temp = Character.toUpperCase(s.charAt(i));
				} else {
					temp = s.charAt(i);
				}
				output += temp;
			}
			s = output;
			System.out.println();
			System.out.println(s);
		}, "upper&Lower");
		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((s) -> {
			String temp = "";

			for (int i = 0; i < s.length(); i++) {
				temp += s.charAt(i);
				temp += ".";
			}
			s = temp;
			System.out.println(s);

		}, "seperated");
		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.
		printCustomMessage((s) -> {
			String temp = "";
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
						|| s.charAt(i) == 'u' || s.charAt(i) == 'y') {

				} else {
					temp += s.charAt(i);
				}
			}
			s = temp;
			System.out.println(s);

		}, "No vowels");

	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}

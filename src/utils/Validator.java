package utils;

import java.util.Scanner;

public class Validator {
	public String validateInput(Scanner scanner, String label, String type) {
		int test;
		String input, regex = ".*", errorMsg = "";
		
		if (type.equals("email")) {
			regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
					+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
			errorMsg = "Err: Format email salah, ulangi lagi...!";
		} else if (type.equals("password")) {
			regex = "^(?=.*\\d)(?=.*[a-z]).{5,20}$";
			errorMsg = "Err: Format password salah, ulangi lagi...!";
		}
		do {
			test = 1;
			System.out.print(label);
			input = scanner.nextLine();
			
			if (!input.matches(regex)) {
				System.out.println(errorMsg);
				test = 0;
			}
			
		} while (test == 0);
		
		return input;
	}
}

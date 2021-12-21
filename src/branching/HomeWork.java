package branching;

public class HomeWork {
	public static void main(String[] args) {
		/**
		 Question 1:
		 You are given a String variable colorOption. Your task is to dsplay in console:
		 	*"Red color" if colorOption is equal to "Red"
		 	*"Orange Color" if colorOption is equal to "Orange"
		 	*"Black color" if colorOption is equal to "Black"
		 	*"Wrong color, not available" if colorOption is none of the above
		 */
		
		// Question 1 Switch
		String colorOption = "Orange";
		String colorChoice;
		switch (colorOption) {
		case "Red":
			colorChoice = "Red color";
			break;
		case "Orange":
			colorChoice = "Orange color";
			break;
		case "Black":
			colorChoice = "Black color";
			break;
		default:
			colorChoice = "Wrong color, not available";
			break;
		}
		System.out.println("Question 1 :: Choosing a Color");
		System.out.println("Switch: " + colorChoice);
		
		// Question 1 If-Else
		if (colorOption == "Red") {
			colorChoice = "Red color";
		} else if (colorOption == "Orange") {
			colorChoice = "Orange color";
		} else if (colorOption == "Black") {
			colorChoice = "Black color";
		} else {
			colorChoice = "Wrong color, not availbable";
		}
		System.out.println("If Else: " + colorChoice);
		System.out.println("********************************");
		
		/**
		 Question 2:
		 Declare and initialize char gender (M, m, F, f) and print the full gender (Female, Male) using
		 a. switch statement
		 b. if else statement
		 */
		
		// Question 2 Switch
		char gender = 'M';
		String genderChoice;
		switch (gender) {
		case 'm':
			genderChoice = "Male";
			break;
		case 'M':
			genderChoice = "Male";
			break;
		case 'f':
			genderChoice = "Female";
			break;
		case 'F':
			genderChoice = "Female";
			break;
		default:
			genderChoice = "Not a gender... please select m or f";
			break;
		}
		System.out.println("Question 2 :: Choosing a Gender");
		System.out.println("Switch: " + genderChoice);
		
		// Question 2 If-Else
		if (gender == 'f') {
			genderChoice = "Female";
		} else if (gender == 'F') {
			genderChoice = "Female";
		} else if (gender == 'M') {
			genderChoice = "Male";
		} else if (gender == 'm') {
			genderChoice = "Male";
		} else {
			genderChoice = "Not a gender.. please select m or f";
		}
		System.out.println("If Else: " + genderChoice);
		System.out.println("********************************");

		/**
		 Question 3:
		 Declare and initialize int number. Check whether the number is EVEN or ODD using
		 a. Switch statement
		 b. If else statement
		 */
		
		// Question 3 Switch
		int number = 3;
		String isOdd = "";

		switch (number % 2) {
		case 0:
			isOdd = "Even Number";
			break;
		default:
			isOdd = "Odd Number";
			break;
		}
		System.out.println("Question 3 :: Even or Odd");
		System.out.println("Switch: " + isOdd);

		// Question 3 If-Else
		if (number % 2 == 0) {
			isOdd = "Even Number";
		} else {
			isOdd = "Odd Number";
		}
		System.out.println("If Else: " + isOdd);
		System.out.println("********************************");
	}
}

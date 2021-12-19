package branching;

public class HomeWork {
	public static void main(String[] args) {

		// Question 1
		String colorOption = "Red";
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
		System.out.println(colorChoice);
		System.out.println("****************");

		if (colorOption == "Red") {
			colorChoice = "Red color";
		} else if (colorOption == "Orange") {
			colorChoice = "Orange color";
		} else if (colorOption == "Black") {
			colorChoice = "Black color";
		} else {
			colorChoice = "Wrong color, not availbable";
		}
		System.out.println(colorChoice);
		System.out.println("*****************");

		// Question 2
		char gender = 'f';
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
		System.out.println(genderChoice);
		System.out.println("**************");

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
		System.out.println(genderChoice);
		System.out.println("***************");

		// Question 3
		int number = 0;
		String isOdd;
		if (number % 2 == 0) {
			isOdd = "Even Number";
		} else {
			isOdd = "Odd Number";
		}
		System.out.println(isOdd);
		System.out.println("**************");

		switch (number % 2) {
		case 0:
			isOdd = "Even Number";
			break;
		default:
			isOdd = "Odd Number";
			break;
		}
		System.out.println(isOdd);
	}
}

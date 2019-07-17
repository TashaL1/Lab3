import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num1;
		String userName = "";
		String cont = "y";

		System.out.println("Please enter your first name: ");
		userName = scan.next();

		while (cont.equalsIgnoreCase("y")) {
			System.out.println("Please enter a whole number between 1 and 100: ");
			num1 = scan.nextInt();
			if (num1 <= 0) {
				System.out.println("Please enter a number between 1 - 100");
				num1 = scan.nextInt();

				// this is an odd number
			}
			if (num1 % 2 != 0 ) {
				System.out.println(userName + " you entered " + num1 + ", which is an odd number.");
			}

			if (num1 >= 2 && num1 <= 25 && num1 % 2 == 0) {
				System.out.println(userName + " you entered " + num1 + ", which is even and less than 25.");
			} else if (num1 >= 26 && num1 <= 60 && num1 % 2 == 0) {
				System.out.println(userName + " you entered " + num1 + ", which is even.");
			} else if (num1 > 60 && num1 % 2 == 0) {
				System.out.println(userName + " you entered " + num1 + ", which is even.");
			} else if (num1 > 60 && num1 % 2 != 0) {
				System.out.println(userName + " you entered " + num1 + ", which is odd and over 60.");

			}

			System.out.println("Would you like to continue? (y/n)");
			cont = scan.next();
		}
		scan.close();

		System.out.println("Thank you for your participation " + userName + ".");
	}
}

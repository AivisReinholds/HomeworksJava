import java.util.Scanner;

public class DateValidator {

	public static void main(String[] args) {

		Scanner consoleScanner = new Scanner(System.in);

		System.out.println("Ievadiet datumu (kā skaitli): ");
		int day = consoleScanner.nextInt();
		System.out.println("Ievadiet gada mēnesi (kā skaitli): ");
		int monthIndex = consoleScanner.nextInt();

		System.out.println("Ievadiet gadu (kā skaitli): ");
		int year = consoleScanner.nextInt();

		consoleScanner.close();

		String[] month = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		if (monthIndex > 12 || monthIndex < 1) {
			System.out.println("Šāds mēnesis neeksistē!");
		}

		switch (monthIndex) {
		case 1:

			if (day > 31 || day < 1) {
				System.out.println("Ievadītais datums nav derīgs!");
			} else {

				System.out.println((day) + "," + " " + month[0] + " " + (year));
			}
			break;
		case 2:

			if (day > 29 || day < 1) {
				System.out.println("Ievadītais datums nav derīgs!");
			}

			else if (year % 4 == 0 && day <= 29 || day <= 1) {
				System.out.println((day) + "," + " " + month[1] + " " + (year));
			}

			else if (year % 4 != 0 && day <= 28 || day <= 1) {
				System.out.println((day) + "," + " " + month[1] + " " + (year));
			} else {
				System.out.println("Šāds datums šāda gada februārī nebūs!");
			}

			break;
		case 3:
			if (day > 31 || day < 1) {
				System.out.println("Ievadītais datums nav derīgs!");
			} else {

				System.out.println((day) + "," + " " + month[2] + "" + (year));
			}
			break;
		case 4:
			if (day > 30 || day < 1) {
				System.out.println("Ievadītais datums nav derīgs!");
			} else {

				System.out.println((day) + "," + " " + month[3] + " " + (year));
			}
			break;
		case 5:
			if (day > 31 || day < 1) {
				System.out.println("Ievadītais datums nav derīgs!");
			} else {

				System.out.println((day) + "," + " " + month[4] + " " + (year));
			}
			break;
		case 6:
			if (day > 30 || day < 1) {
				System.out.println("Ievadītais datums nav derīgs!");
			} else {

				System.out.println((day) + "," + " " + month[5] + " " + (year));
			}
			break;
		case 7:
			if (day > 31 || day < 1) {
				System.out.println("Ievadītais datums nav derīgs!");
			} else {

				System.out.println((day) + "," + " " + month[6] + " " + (year));
			}
			break;
		case 8:
			if (day > 31 || day < 1) {
				System.out.println("Ievadītais datums nav derīgs!");
			} else {

				System.out.println((day) + "," + " " + month[7] + " " + (year));
			}
			break;
		case 9:
			if (day > 30 || day < 1) {
				System.out.println("Ievadītais datums nav derīgs!");
			} else {

				System.out.println((day) + "," + " " + month[8] + " " + (year));
			}
			break;
		case 10:
			if (day > 31 || day < 1) {
				System.out.println("Ievadītais datums nav derīgs!");
			} else {

				System.out.println((day) + "," + " " + month[9] + " " + (year));
			}
			break;
		case 11:
			if (day > 30 || day < 1) {
				System.out.println("Ievadītais datums nav derīgs!");
			} else {

				System.out.println((day) + "," + " " + month[10] + " " + (year));
			}
			break;
		case 12:
			if (day > 31 || day < 1) {
				System.out.println("Ievadītais datums nav derīgs!");
			} else {

				System.out.println((day) + "," + " " + month[11] + " " + (year));
			}
			break;

		}

	}

}

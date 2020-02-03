import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Ievadiet savu vārdu un uzvārdu: ");
		String name = sc.nextLine();

		name.trim();
		if (!name.contains(" ")) {
			System.out.println("Ievadijāt 1 vārdu");
		}
		sc.close();

		int emptySpace = 0;
		for (int i = 0; i < name.length(); i++) {
			emptySpace++;
			if (name.charAt(i) == ' ') {

				String firstName = name.substring(0, emptySpace - 1).toLowerCase();
				String firstLetter = firstName.trim().substring(0, 1).toUpperCase();
				String withoutFirstLetterName = name.substring(1, emptySpace - 1);
				String completeName = firstLetter + withoutFirstLetterName.trim();

				int numberOfIndex = name.length();
				String surName = name.substring(emptySpace, numberOfIndex).trim().toUpperCase();

				if (surName.contains("")) {

					int emptyPlaceSurname = surName.indexOf(" ");
					String surnamePartOne = surName.substring(0, emptyPlaceSurname).trim();
					String surnamePartTwo = surName.substring(emptyPlaceSurname, surName.length()).trim();
					String revisedSurname = surnamePartOne + " " + surnamePartTwo;

					System.out.println("'" + (completeName) + " " + (revisedSurname) + "'");
				}

				break;

			}

		}

	}
}
import java.util.Scanner;

public class ConditionalMath {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Ievadiet savu vārdu: ");
		String name = sc.next();

		System.out.print("Ievadiet skaitli a: ");
		int a = sc.nextInt();

		System.out.print("ievadiet skaitli b: ");
		int b = sc.nextInt();

		sc.close();

		if (a > b) {
			System.out.println("Skaitlis a lielāks par b");
		} else if (b > a) {
			System.out.println("Skaitlis b lielāks par a");
		}

		else {
			System.out.println("Skaitlis ir vienādi");
		}

		int sum = a + b;
		int nameLenght = name.length();
		// System.out.print(nameLenght);

		if (sum > nameLenght) {
			System.out.println("Skaitļu summa ir " + " " + (sum) + " " + "lielāka par burtu skaitu" + " " + (nameLenght)
					+ " " + "vārdā");
		} else if (sum < nameLenght) {
			System.out.println("Skaitļu summa ir " + " " + (sum) + " " + "mazāka par burtu skaitu" + " " + (nameLenght)
					+ " " + "vādā");
		}

		else {
			System.out.println(
					"Skaitlis" + " " + (sum) + " " + "un burtu skaits vārdā" + " " + (nameLenght) + " " + "ir vienādi");
		}

	}

}

import java.util.Scanner;

public class GreetingsInteractive {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Ievadiet savu vārdu: ");
		String name = sc.next();

		System.out.print("ievadiet sacu vecumu: ");
		int age = sc.nextInt();

		sc.close();

		System.out.println("Sveiki, mani sauc" + " " + (name) + " " + "esmu" + " " + (age) + " " + "jauns!");

	}

}

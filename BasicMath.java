import java.util.Scanner;

public class BasicMath {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Ievadiet skaitli A: ");
		int A = sc.nextInt();

		System.out.print("ievadiet skaitli B ar komatu: ");
		float B = sc.nextFloat();

		sc.close();

		float sum = A + B;
		float sub = A - B;
		float mult = A * B;
		float div = A / B;
		float square = (float) Math.pow(sum, 2);

		System.out.println("Skaitļu A un B summa ir:" + " " + (sum) + " ");
		System.out.println("Skaitļu A un B starpība ir:" + " " + (sub) + " ");
		System.out.println("Skaitļu A un B reizinājums ir:" + " " + (mult) + " ");
		System.out.println("Skaitļu A un B dalījums ir:" + " " + (div) + " ");
		System.out.println("Skaitļu  A un B summas kvadrātsa ir:" + " " + (square) + " ");

	}
}
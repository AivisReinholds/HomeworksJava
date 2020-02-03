import java.util.Random;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ievadiet masīva izmēru robežās no 20 līdz 40:");
		int arraySize = sc.nextInt();
		int[] Array = new int[arraySize];
		sc.close();

		Random rnd = new Random();

		for (int i = 0; i < arraySize; i++) {
			Array[i] = 10 + rnd.nextInt(100);
			System.out.print(Array[i] + ", ");
		}

		int pagaidu = 0;
		for (int i = 0; i < arraySize; i++) {

			for (int j = i + 1; j < arraySize; j++) {

				if (Array[i] > Array[j]) {

					pagaidu = Array[i];
					Array[i] = Array[j];
					Array[j] = pagaidu;

				}
			}
		}

		System.out.println();

		System.out.println("Pieaugošā secībā: ");
		for (int i = 0; i < arraySize; i++) {
			System.out.print(Array[i] + ", ");
		}

	}
}
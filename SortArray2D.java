import java.util.Random;
import java.util.Scanner;

public class SortArray2D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("2D masīva vērtību skaits robežās no 0 līdz 20):");
		int izmers = sc.nextInt();

		int skaitluGenerators = 0;

		int[][] arr = new int[izmers][skaitluGenerators];

		Random rnd = new Random();

		for (int j = 0; j < izmers; j++) {
			arr[skaitluGenerators] = 100 + rnd.nextInt(1000);
		}

		sc.close();

		// masiva izvadīšanai
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}

	}
}

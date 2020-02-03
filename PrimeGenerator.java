import java.util.Scanner;

public class PrimeGenerator {

	public static void main(String[] args) {

		int status = 1;
		int num = 3;

		Scanner sc = new Scanner(System.in);

		System.out.println("Cik secigus pirmskaitļus vēlaties uzģenerēt robežās no 0 līdz 100):");
		int n = sc.nextInt();

		sc.close();

		if (n > 1) {
			System.out.println("Pirmsskaitļi ir:");
			System.out.println("2");
		}
		for (int i = 2; i <= n;) {

			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					status = 0;
					break;
				}
			}
			if (status != 0) {

				System.out.println(num);
				i++;

			}
			status = 1;
			num++;

		}

	}
}
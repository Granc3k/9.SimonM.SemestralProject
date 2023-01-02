import java.util.Scanner;

public class christmasSimon {
	static Scanner sc = new Scanner(System.in);

	public static void christmasProject(String[] args) {
		int d, x, y, r, temp;
		// in
		System.out.print("Zadejte polomer ozdoby:");
		r = sc.nextInt();
		d = 2 * r;
		// print
		for (int rad = 0; rad <= d; rad++) {
			for (int slo = 0; slo <= d; slo++) {
				// urceni smeru
				x = r - rad;
				y = r - slo;

				temp = x * x + y * y;
				// zjisteni kde je temp
				if (temp <= r * r + 1) {
					System.out.print("/#");
				} else {
					System.out.print("  ");
				}
			}
			// preskok na dalsi radek
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println("Vesele Vanoce :)");
	}
}
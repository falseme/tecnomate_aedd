import java.util.Scanner;

public class C {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		long time = System.nanoTime();

		for (int i = 0; i < count; i++) {

			int n = sc.nextInt();
			sc.nextLine(); // >:(
			String s = sc.nextLine();

			if (n < 5 || n > 32 || n % 2 == 0) {
				System.out.println("CONTRASENA NO SEGURA");
				continue;
			}
			if (s.charAt(0) != s.toLowerCase().charAt(0) || s.charAt(n - 1) != s.toUpperCase().charAt(n - 1)) {
				System.out.println("CONTRASENA NO SEGURA");
				continue;
			}
			if (!esPrimo("" + s.charAt(n / 2))) {
				System.out.println("CONTRASENA NO SEGURA");
				continue;
			}

			System.out.println("CONTRASENA SEGURA");

		}

		sc.close();
		double deltatime = System.nanoTime() - time;
		System.out.println("Time (ms): " + deltatime / 1000000);

	}

	private static boolean esPrimo(String s) {

		int n = 0;
		try {
			n = Integer.valueOf(s);
		} finally {
		}

		return esPrimo(n);

	}

	private static boolean esPrimo(int n) {

		if (n < 2)
			return false;

		int r = (int) Math.sqrt(n);
		for (int i = 2; i < r; i++)
			if (n % i == 0)
				return false;
		return true;

	}

}

import java.util.Scanner;

public class E {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		long time = System.nanoTime();

		for (int i = 0; i < count; i++) {
			int m = sc.nextInt();
			int sum = m * (m + 1) * (2 * m + 1) / 6 + m * (m + 1) / 2 - m;
			System.out.println(sum);
		}

		sc.close();
		double deltatime = System.nanoTime() - time;
		System.out.println("Time (ms): " + deltatime / 1000000);

	}

}

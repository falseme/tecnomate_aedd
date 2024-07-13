import java.util.Scanner;

public class D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		long time = System.nanoTime();

		for (int i = 0; i < count; i++) {

			boolean corner = false;
			int seconds = 0;
			int x = 0, y = 0; // logo pos
			int sx = 1, sy = 1; // logo speed
			int N = sc.nextInt(); // h - screen
			int M = sc.nextInt(); // w - screen
			int n = sc.nextInt(); // h - logo
			int m = sc.nextInt(); // w - logo

			while (!corner) {

				x += sx;
				y += sy;

				if (x <= 0)
					sx = 1;
				else if (x + m >= M)
					sx = -1;
				if (y <= 0)
					sy = 1;
				else if (y + n >= N)
					sy = -1;

				if (x == 0 && y == 0 || x == M - m && y == 0 || x == 0 && y == N - n || x == M - m && y == N - n)
					corner = true;

				seconds++;

			}

			System.out.println(seconds);

		}

		sc.close();
		double deltatime = System.nanoTime() - time;
		System.out.println("Time (ms): " + deltatime / 1000000);

	}

}

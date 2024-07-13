import java.util.Scanner;

public class F {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		long time = System.nanoTime();

		int[][] img = new int[size][size];
		int[] minrow = new int[size];

		for (int i = 0; i < size; i++) {
			int min = 256;
			for (int j = 0; j < size; j++) {
				img[i][j] = sc.nextInt();
				if (img[i][j] < min)
					min = img[i][j];
			}
			minrow[i] = min;
		}

		int zerocols = 0;
		for (int j = 0; j < size; j++) {
			int zeros = 0;
			for (int i = 0; i < size; i++) {
				img[i][j] = img[i][j] % minrow[i];
				if (img[i][j] == 0)
					zeros++;
			}
			if (zeros == size)
				zerocols++;
		}

		System.out.println(zerocols);

		sc.close();
		double deltatime = System.nanoTime() - time;
		System.out.println("Time (ms): " + deltatime / 1000000);

	}

}

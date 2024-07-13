import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int[] per = new int[reader.nextInt()];
		long time = System.nanoTime();
		for (int i = 0; i < per.length; i++)
			per[i] = reader.nextInt();
		reader.close();

		for (int i = 1; i < per.length; i++)
			if (per[i] != per[i - 1] % per.length + 1) {
				System.out.println("NO");
				return;
			}

		System.out.println("SI");
		double deltatime = System.nanoTime() - time;
		System.out.println("Time (ms): " + deltatime / 1000000);

	}

}

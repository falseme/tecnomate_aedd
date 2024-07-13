import java.util.Scanner;

public class B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int rows = sc.nextInt();
		int cols = sc.nextInt();
		long time = System.nanoTime();
		char[][] mat = new char[rows][cols];

		sc.nextLine(); // >:( >:( >:( >:( >:( >:( >:( >:(
		int count = 0;
		for (int i = 0; i < rows; i++) {
			String s = sc.nextLine();
			if (s.contains("bug") || s.contains("gub"))
				count++;
			for (int j = 0; j < cols; j++)
				mat[i][j] = s.charAt(j);
		}

		for (int j = 0; j < cols; j++) {
			String s = "";
			for (int i = 0; i < rows; i++)
				s = s.concat("" + mat[i][j]);
			if (s.contains("bug") || s.contains("gub"))
				count++;
		}

		System.out.println("\nENFERMEDAD: " + count);

		sc.close();
		double deltatime = System.nanoTime() - time;
		System.out.println("Time (ms): " + deltatime / 1000000);

	}

}

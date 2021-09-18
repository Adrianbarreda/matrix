package application;

import java.util.Locale;
import java.util.Scanner;

public class Matrix_program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		int X = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				if (mat[i][j] == X) {
					System.out.println("Position: " + i + j);

					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}

					if (j < n - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}

					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}

					if (i < m - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}

			}
		}
		sc.close();

	}

}

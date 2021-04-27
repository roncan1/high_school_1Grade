package package1;

import java.util.Random;

public class Main {
	public static void main(String[] args) {

		int day = 0;

		int a[][] = new int[5][7];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {

				day++;
				a[i][j] = day;
				System.out.print(a[i][j] + " ");
				if (day == 31) {
					break;
				}
			}
			System.out.println();
		}

	}

}

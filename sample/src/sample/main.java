package sample;

import java.util.Random;

public class main {
	public static void main(String[] args) {
		int a = 1;
		int b = 5;
		for (int i = 0; i < 5; i++) {
			if (a != 0) {
				System.out.print(" ");
			}
			for (int j = 0; j < b; j++) {
				System.out.print("*");
			}
			b -= 2;
			a++;
			System.out.println();
		}
		
	}

}
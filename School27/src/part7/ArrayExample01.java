package part7;

import java.util.Random;

public class ArrayExample01 {
	
	
	public static void main(String[] args) {
		Random random = new Random();
		int score[] = new int[10];
		
		for (int i = 0; i < score.length; i++) {
			score[i] = random.nextInt(10);
			
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
			
		}		
		
	}

}

package part1;



public class Main {
	public static void main(String[] args) {
		Double weight = 87.3;

		System.out.println("몸무게를 입력하세요 : " + weight);


		if (weight <= 58.80) {
			System.out.println("Flyweight");
			
		} else if (weight <= 61.23) {
			System.out.println("Lightweight");

		} else if (weight <= 72.57) {
			System.out.println("Middleweight");

		} else if (weight <= 88.45) {
			System.out.println("Cruiserweight");

		}else {
			System.out.println("Heavyweight");
			
		}
	}

}

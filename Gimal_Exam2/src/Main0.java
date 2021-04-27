import java.util.Scanner;

public class Main0 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력");
		String you = scanner.next();
		switch (you) {
		case "가위":
			System.out.println("패배");
			break;
		case "바위":
		    System.out.println("비김");
			break;
		case "보":
			System.out.println("이김");
			break;
		}
		
		
			}
}
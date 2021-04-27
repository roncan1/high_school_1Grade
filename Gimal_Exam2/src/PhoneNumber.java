import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {

		int firstNumber;
        int secondNumber;
		int thirdNumber;

		String phoneNumber;
     	String goldNumberCheck = "일반번호 입니다.";
		boolean phoneNumberBoolean = false;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("첫번째 영역을 입력하세요(010) : ");
			firstNumber = scanner.nextInt();
			if (firstNumber == 10) {
				break;
			}
		} while (firstNumber >= 0);

		do {
			System.out.print("두번째 영역을 입력하세요(1000~9999) : ");
			secondNumber = scanner.nextInt();
			if (secondNumber >= 1000 && secondNumber <= 9999) {
				break;
			}
		} while (secondNumber >= 0);

		do {
			System.out.print("세번째 영역을 입력하세요(1000~9999) : ");
			thirdNumber = scanner.nextInt();
			if (thirdNumber >= 1000 && thirdNumber <= 9999) {
				break;
			}
		} while (thirdNumber >= 0);

		phoneNumber = "0" + firstNumber + "-" + secondNumber + "-" + thirdNumber;

		switch (secondNumber) {
		case 1111:
		case 2222:
		case 3333:
		case 4444:
		case 5555:
		case 6666:
		case 7777:
		case 8888:
		case 9999:
			phoneNumberBoolean = true;
			goldNumberCheck = "골드 넘버입니다 +_+;";
			break;
		}

		switch (thirdNumber) {
		case 1111:
		case 2222:
		case 3333:
		case 4444:
		case 5555:
		case 6666:
		case 7777:
		case 8888:
		case 9999:
			phoneNumberBoolean = true;
			goldNumberCheck = "골드 넘버입니다 +_+;";
			break;
		}

		if (phoneNumberBoolean) {
			System.out.println("당신이 입력한 번호는 : " + phoneNumber);
			System.out.println(goldNumberCheck);
		} else {
			System.out.println("당신이 입력한 번호는 : " + phoneNumber);
			System.out.println(goldNumberCheck);
		}

	}

}

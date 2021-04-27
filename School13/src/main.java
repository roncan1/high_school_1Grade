
public class main {

	
public static void main(String[] args) {
	int inputCheck = 0;
scanner scanner = new Scanner(System.in);
	do {
		System.out.println("이름을 입력하세요 : ");
		System.out.println("나이를 입력하세요 : ");
		System.out.println("주소를 입력하세요 : ");
		System.out.print("계속 입력하시겠습니까?(1.yes/2.no) : ");
		inputCheck = scanner.nestint();
	} while (inputCheck == 1);
}
}
 
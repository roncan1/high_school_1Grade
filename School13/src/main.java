
public class main {

	
public static void main(String[] args) {
	int inputCheck = 0;
scanner scanner = new Scanner(System.in);
	do {
		System.out.println("�̸��� �Է��ϼ��� : ");
		System.out.println("���̸� �Է��ϼ��� : ");
		System.out.println("�ּҸ� �Է��ϼ��� : ");
		System.out.print("��� �Է��Ͻðڽ��ϱ�?(1.yes/2.no) : ");
		inputCheck = scanner.nestint();
	} while (inputCheck == 1);
}
}
 
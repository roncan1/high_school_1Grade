import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		studentInfo();
	}
	static void studentInfo(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�г�");
		 int grade = scanner.nextInt();
		
		System.out.print("��");
		int classnum = scanner.nextInt();
		
		System.out.print("��ȣ");
		int number = scanner.nextInt();
		
		System.out.print("�̸�");
		String name = scanner.next();
		
		System.out.println(grade + "-" + classnum + "-" + number + " " + name);
		
	}  
	
}

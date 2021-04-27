import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	

		Scanner scanner = new Scanner(System.in);
	
	System.out.print("학년");
	int grade = scanner.nextInt();
	
	System.out.print("반");
	int classnum = scanner.nextInt();
	
	System.out.print("번호");
	int number = scanner.nextInt();
	
	System.out.print("이름");
	String name = scanner.next();
	
	System.out.println(grade + "-" + classnum + "-" + number + " " + name);
  }
}
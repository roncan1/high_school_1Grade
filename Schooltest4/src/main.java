
public class main {
	
	public static void main(String[] args) {
		Student student = new Student();
		student.name = "ȫ�浿";
		student.classNum = 1;
		student.number = 1;
		student.korScore = 100;
		student.engScore = 60;
		student.mathScore = 76;
		
		System.out.println("�̸� : " + student.name);
		System.out.println("���� : " + student.getTotal());
		System.out.println("��� : " + student.getAverage());
		
	}
}



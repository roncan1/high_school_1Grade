
public class main {
	
	public static void main(String[] args) {
		Student student = new Student();
		student.name = "È«±æµ¿";
		student.classNum = 1;
		student.number = 1;
		student.korScore = 100;
		student.engScore = 60;
		student.mathScore = 76;
		
		System.out.println("ÀÌ¸§ : " + student.name);
		System.out.println("ÃÑÁ¡ : " + student.getTotal());
		System.out.println("Æò±Õ : " + student.getAverage());
		
	}
}



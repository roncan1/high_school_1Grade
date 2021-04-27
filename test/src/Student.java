
public class Student {
	String name;
	int classNum;
	int number;
	int korScore;
	int engScore;
	int mathScore;
	int total = 100 + 60 + 76;
	double Average = 236 / 3;

	public Student(String na,int classN,int numb,int korS,
			int engS,int mathS) {
		name = na;
		classNum = classN;
	    number = numb;
	    korScore = korS;
	    engScore = engS;
	    mathScore = mathS;	
	}
	public String info() {
		System.out.println(name);
		System.out.println(classNum);
		System.out.println(number);
		System.out.println(korScore);
		System.out.println(engScore);
		System.out.println(mathScore);
		System.out.println(total);
		System.out.println(Average);
		return name;
		
		}
	public int getTotal() {
		int total = 100 + 60 + 76;
		return total;
		

	}
	public double getAverage() {
		Average = 236 / 3;
		return Average;
	}
}

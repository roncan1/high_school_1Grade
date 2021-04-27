
public class Student {
	String name;
	int classNum;
	int number;
	int korScore;
	int engScore;
	int mathScore;
	int getTotal = 100 + 60 + 76;
	double getAverage = 236 / 3;
	public Student() {	}
	public Student(String na,int classN,int numb,int korS,int engS,int mathS) {
		    name = na;
		    classNum = classN;
		    number = numb;
		    korScore = korS;
		    engScore = engS;
		    mathScore = mathS;	
		}
	public int getTotal() {
		int getTotal = 100 + 60 + 76;
		return getTotal;
		

	}
	public double getAverage() {
		getAverage = 236 / 3;
		return getAverage;
	}
}

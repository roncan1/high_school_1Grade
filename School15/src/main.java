
public class main {
	
	public static void main(String[] args) {
		int result = 0;
		for (int i = 1; i < 100; i++) {
			result = result + 1;
			System.out.println(i+"뻔쨰, 1부터~100까지 더한 값 :"+result);
			if(result > 100)break;
		}
	}
}


public class MyPoint {

	static int x;
	static int y;
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	static double getDistance(int x1, int y1) {
		return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
	}
	
}


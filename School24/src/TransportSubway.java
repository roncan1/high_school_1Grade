
public class TransportSubway {

	final int MAX_PASSENGER = 25;
	private int passergerNumber = MAX_PASSENGER;
	private int money;
	
	public void takesubway(int money) {
		this.money = money;
		passergerNumber = passergerNumber - 1;
		
	
		
	}

	public void getoffsubway() {
	passergerNumber = passergerNumber + 1;
		
	}
	
	void infoPrintln() {
		System.out.println("Å¾½Â°¡´É½Â°´: "+passergerNumber);
		System.out.println("qjtmtndlr: "+money);
	}
}

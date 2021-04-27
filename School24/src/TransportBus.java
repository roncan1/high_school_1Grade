
public class TransportBus {


	final int MAX_PASSENGER = 25;
	private int passergerNumber = MAX_PASSENGER;
	private int money;
	
	public void takeBus(int i) {
		this.money = this.money + money;
		passergerNumber = passergerNumber - 1;
		
	
		
	}

	public void getoffBus() {
	passergerNumber = passergerNumber + 1;
		
	}
	
	void infoPrintln() {
		System.out.println("Å¾½Â°¡´É½Â°´: "+passergerNumber);
		System.out.println("¹ö½º¼öÀÍ: "+money);
	}
}


public class TransportPerson {

	int money;
	String name;
	private boolean bordingCheck = false;
	
	public TransportPerson(String name, int money) {
		this.name = name;
		this.money = money;
		
	}
	void geyOnBus(TransportBus bus) {
		if (bordingCheck == false) {
			bus.takeBus(1000);
			money = money - 1000;
			bordingCheck = true;
		}else {
			System.out.println(name+"대중교통 탑승");
		}
	}
	void getOddBus(TransportBus bus) {
		bus.getoffBus();
		bordingCheck = false;
	}
	void geyOnSubway(TransportSubway subway) {
		if (bordingCheck == false) {
			subway.takesubway(1700);
			money = money - 1700;
			bordingCheck = true;
		}else {
			System.out.println(name+"대중교통 탑승");
		}
	}
	void getOffSubway(TransportSubway subway) {
		subway.getoffsubway();
		bordingCheck = false;
	}
	
	void infoPrintln() {
		System.out.println(name+"의 남은돈: "+money);
		if (bordingCheck) {
			System.out.println("대중교통을 이용중입니다");
		}else{
			System.out.println("걸어다니는중입니다");
		}
	}
}

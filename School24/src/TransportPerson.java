
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
			System.out.println(name+"���߱��� ž��");
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
			System.out.println(name+"���߱��� ž��");
		}
	}
	void getOffSubway(TransportSubway subway) {
		subway.getoffsubway();
		bordingCheck = false;
	}
	
	void infoPrintln() {
		System.out.println(name+"�� ������: "+money);
		if (bordingCheck) {
			System.out.println("���߱����� �̿����Դϴ�");
		}else{
			System.out.println("�ɾ�ٴϴ����Դϴ�");
		}
	}
}

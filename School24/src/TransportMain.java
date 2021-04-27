
public class TransportMain {

	public static void main(String[] args) {
		TransportPerson pilsang = new TransportPerson("윤필상", 10000);
		TransportPerson sukho = new TransportPerson("이석호", 10000);
		TransportPerson pilsaseohyunng = new TransportPerson("이서현", 10000);
		
		TransportBus blueBus = new TransportBus();
		TransportSubway greenSubway = new TransportSubway();
		
		pilsang.infoPrintln();
		pilsang.geyOnBus(blueBus);
		pilsang.infoPrintln();
		blueBus.infoPrintln();
		
		sukho.geyOnBus(blueBus);
		System.out.println();
		blueBus.infoPrintln();
		
	}
}

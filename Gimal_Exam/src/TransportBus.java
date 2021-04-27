
public class TransportBus {

    final int MAX_PASSENGERS = 25;
    private int passengerNumber = MAX_PASSENGERS;
    private int busMoney;

    public void takeBus(TransportPerson person) {
        if (passengerNumber >= 0 && person.transfer == false) {
            passengerNumber--;
            person.money = person.money - 1000;
            busMoney = busMoney + 1000;
        } else if (passengerNumber >= 0 && person.transfer == true) {
        	passengerNumber--;
            person.money = person.money - 500;
            busMoney = busMoney + 500;
		} else {
            System.out.println("남은 좌석 : " + passengerNumber);
            System.out.println("더 이상 탑승하실 수 없습니다.");
        }
    }

    public void getOffBus() {
        passengerNumber++;
    }

    void busInfo() {
        System.out.println("현재 탑승 인원 수 : " + (MAX_PASSENGERS - passengerNumber) + "명");
        System.out.println("버스 수익금 : " + busMoney);
    }
}
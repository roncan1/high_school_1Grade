
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
            System.out.println("���� �¼� : " + passengerNumber);
            System.out.println("�� �̻� ž���Ͻ� �� �����ϴ�.");
        }
    }

    public void getOffBus() {
        passengerNumber++;
    }

    void busInfo() {
        System.out.println("���� ž�� �ο� �� : " + (MAX_PASSENGERS - passengerNumber) + "��");
        System.out.println("���� ���ͱ� : " + busMoney);
    }
}
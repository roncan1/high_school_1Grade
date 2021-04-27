
public class TransportSubway {

    final int MAX_PASSENGERS = 40;
    private int passengerNumber = MAX_PASSENGERS;
    private int subwayMoney;

    public void takeSubway(TransportPerson person) {
        if (passengerNumber >= 0 && person.transfer == false) {
            passengerNumber--;
            person.money = person.money - 1500;
            subwayMoney = subwayMoney + 1500;
        } else if(passengerNumber >= 0 && person.transfer == true) {
        	passengerNumber--;
            person.money = person.money - 750;
            subwayMoney = subwayMoney + 750;
        } else {
            System.out.println("���� �¼� : " + passengerNumber);
            System.out.println("�� �̻� ž���Ͻ� �� �����ϴ�.");
        }
    }

    public void getOffSubway() {
        passengerNumber++;
    }

    void subwayInfo() {
        System.out.println("���� ž�� �ο� �� : " + (MAX_PASSENGERS - passengerNumber) + "��");
        System.out.println("����ö ���ͱ� : " + subwayMoney);
    }
}

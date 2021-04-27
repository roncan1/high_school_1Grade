
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
            System.out.println("남은 좌석 : " + passengerNumber);
            System.out.println("더 이상 탑승하실 수 없습니다.");
        }
    }

    public void getOffSubway() {
        passengerNumber++;
    }

    void subwayInfo() {
        System.out.println("현재 탑승 인원 수 : " + (MAX_PASSENGERS - passengerNumber) + "명");
        System.out.println("지하철 수익금 : " + subwayMoney);
    }
}

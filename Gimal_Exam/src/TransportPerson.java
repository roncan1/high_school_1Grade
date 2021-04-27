
public class TransportPerson {

    int money;
    private boolean bordingCheck = false;
    boolean transfer = false;
    String transport = null;
    int busRideCount = 0;
    int subwayRideCount = 0;
    
    public TransportPerson(int money) {
		this.money = money;
	}

    void getOnBus(TransportBus bus) {
    	if (bordingCheck == false && transfer == false) {
    		bus.takeBus(this);
    		bordingCheck = true;
    		transport ="버스";
    		transfer = true;
    	} else if(bordingCheck == false && transfer == true) {
    		bus.takeBus(this);
    		bordingCheck = true;
    		transport ="버스";
    		transfer = false;
    	} else {
    		System.out.println("대중교통을 이용중입니다.");
			
		}
    }
    
    void getOnSubway(TransportSubway subway) {
    	if (bordingCheck == false && transfer == false) {
			subway.takeSubway(this);
			bordingCheck = true;
			transport = "지하철";
			transfer = true;
		} else if(bordingCheck == false && transfer == true) {
			subway.takeSubway(this);
			bordingCheck = true;
			transport = "지하철";
			transfer = false;
		} else {
			System.out.println("대중교통을 이용중입니다.");
			
		}
    }
    
    void getOffBus(TransportBus bus) {
    	if (bordingCheck == false) {
			System.out.println("대중교통을 이용하지 않고 있습니다.");
		} else {
			bus.getOffBus();
			bordingCheck = false;
			busRideCount++;
			transport = null;
		}
    }
    
    void getOffSubway(TransportSubway subway) {
    	if (bordingCheck == false) {
    		System.out.println("대중교통을 이용하지 않고 있습니다.");
    	} else {
    		subway.getOffSubway();
    		bordingCheck = false;
    		subwayRideCount++;
    		transport = null;
    	}
    }
    
    void personInfo() {
    	if (transport == null) {
			System.out.println("대중교통을 이용하지 않습니다.");
		} else {
			System.out.println(transport + "(을)를 이용하고 있습니다.");
		}
    	System.out.println("사용자의 남은 금액 : " + money);
    	System.out.println("버스를 탄 횟수 : " + busRideCount);
    	System.out.println("지하철을 탄 횟수 : " + subwayRideCount);
    }
}




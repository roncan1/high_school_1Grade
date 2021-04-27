
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
    		transport ="����";
    		transfer = true;
    	} else if(bordingCheck == false && transfer == true) {
    		bus.takeBus(this);
    		bordingCheck = true;
    		transport ="����";
    		transfer = false;
    	} else {
    		System.out.println("���߱����� �̿����Դϴ�.");
			
		}
    }
    
    void getOnSubway(TransportSubway subway) {
    	if (bordingCheck == false && transfer == false) {
			subway.takeSubway(this);
			bordingCheck = true;
			transport = "����ö";
			transfer = true;
		} else if(bordingCheck == false && transfer == true) {
			subway.takeSubway(this);
			bordingCheck = true;
			transport = "����ö";
			transfer = false;
		} else {
			System.out.println("���߱����� �̿����Դϴ�.");
			
		}
    }
    
    void getOffBus(TransportBus bus) {
    	if (bordingCheck == false) {
			System.out.println("���߱����� �̿����� �ʰ� �ֽ��ϴ�.");
		} else {
			bus.getOffBus();
			bordingCheck = false;
			busRideCount++;
			transport = null;
		}
    }
    
    void getOffSubway(TransportSubway subway) {
    	if (bordingCheck == false) {
    		System.out.println("���߱����� �̿����� �ʰ� �ֽ��ϴ�.");
    	} else {
    		subway.getOffSubway();
    		bordingCheck = false;
    		subwayRideCount++;
    		transport = null;
    	}
    }
    
    void personInfo() {
    	if (transport == null) {
			System.out.println("���߱����� �̿����� �ʽ��ϴ�.");
		} else {
			System.out.println(transport + "(��)�� �̿��ϰ� �ֽ��ϴ�.");
		}
    	System.out.println("������� ���� �ݾ� : " + money);
    	System.out.println("������ ź Ƚ�� : " + busRideCount);
    	System.out.println("����ö�� ź Ƚ�� : " + subwayRideCount);
    }
}




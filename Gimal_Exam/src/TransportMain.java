
public class TransportMain {
    public static void main(String[] args) {

        TransportPerson pilsang = new TransportPerson(10000);
        TransportBus bus3212 = new TransportBus();
        TransportSubway subwayNo5 = new TransportSubway();

        bus3212.busInfo();
        System.out.println("===========================");

        subwayNo5.subwayInfo();
        System.out.println("===========================");

        pilsang.getOnBus(bus3212);
        bus3212.busInfo();
        System.out.println("===========================");

        pilsang.getOffBus(bus3212);
        pilsang.personInfo();
        System.out.println("===========================");
        
        pilsang.getOnSubway(subwayNo5);
        subwayNo5.subwayInfo();
        System.out.println("===========================");
        
        pilsang.getOffSubway(subwayNo5);
        pilsang.personInfo();
        System.out.println("===========================");
        
        pilsang.getOnSubway(subwayNo5);
        subwayNo5.subwayInfo();
        System.out.println("===========================");
        
        pilsang.getOffSubway(subwayNo5);
        pilsang.personInfo();
        System.out.println("===========================");
        
        bus3212.busInfo();
        System.out.println("===========================");
        subwayNo5.subwayInfo();
        System.out.println("===========================");

    }
}
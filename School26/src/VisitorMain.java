
public class VisitorMain {

	public static void main(String[] args) {
		Visitor visitor1 = new Visitor("���ʻ�", 10000);
		Visitor visitor2 = new Visitor("������", 10000);
		Visitor visitor3 = new Visitor("�۹���", 10000);
		Visitor visitor4 = new Visitor("����", 10000);
		
		
       visitor4.visitMarket();
       visitor2.visitMarket();
       visitor1.visitMarket();
       visitor3.visitMarket();

       visitor1.myStayNumberInfo();
       visitor2.myStayNumberInfo();
       visitor3.myStayNumberInfo();
       visitor4.myStayNumberInfo();
      
	}
}

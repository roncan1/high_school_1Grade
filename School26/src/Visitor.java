
public class Visitor {
	
	static int staystate = 0;
			int money;
			int myStayNumber;
		    String name;
		    
		    
			public Visitor(String name,int money) {
				this.money = money;
			
			}
			void visitMarket() {
				staystate++;
				myStayNumber = staystate;
			
			}
			void myStayNumberInfo( ) {
				System.out.println(name + "�� ����ȣ��"+myStayNumber+"�� �Դϴ�");
			}
}

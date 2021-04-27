
public class VisitorMain {

	public static void main(String[] args) {
		Visitor visitor1 = new Visitor("¿±« ªÛ", 10000);
		Visitor visitor2 = new Visitor("¿Ã¿Á«ı", 10000);
		Visitor visitor3 = new Visitor("º€πŒ¬˘", 10000);
		Visitor visitor4 = new Visitor("∂Û∂Û∂Û", 10000);
		
		
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

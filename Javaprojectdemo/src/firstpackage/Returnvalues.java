package firstpackage;

public class Returnvalues {
public void wontReturn(){
	System.out.println("This method will not retuen anything");
}
public String willReturn(){
	System.out.println("This method retuen back value");
	return "sathya";

}

public int add(){
	return 20;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Returnvalues objectname=new Returnvalues();
objectname.wontReturn();
String myname=objectname.willReturn();
System.out.println(myname);
int intvar=objectname.add();
System.out.println(intvar);
		
	}

}

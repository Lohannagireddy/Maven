package firstpackage;

public class StaticVariables {
	int classvariable=10;
	static int staticvariable=100;
	
	public void increment(){
		++classvariable;
		System.out.println("classvariable value is "+classvariable);
		++staticvariable;
		System.out.println("staticvariable value is"+staticvariable);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticVariables staticvariable=new StaticVariables();
staticvariable.increment();
StaticVariables staticvariable1=new StaticVariables();
staticvariable1.increment();
System.out.println(StaticVariables.staticvariable);

	}

}

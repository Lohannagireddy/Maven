package firstpackage;

public class Operatorsinjava {

	int a = 20, b = 10, c = 50;

	public void Arthameticoprations() {
		int c = a + b;
		System.out.println("addition operator value is" + c);
		c = a - b;
		System.out.println("substraction vlue is" + c);
		c = a / b;
		System.out.println("division value is" + c);
		c = a % b;
		System.out.println("moduler value is" + c);
		++a;
		System.out.println("incremental vlue is" + a);
		--b;
		System.out.println("decremental value is" + b);

	}

	public void relationaloperators() {
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a <= b);
		System.out.println(a >= b);
		System.out.println(a == b);
		System.out.println(a != b);

	}

	public void logicaloperators(){
	 boolean value = false;
	 System.out.println(value);
	 
	 value=(a>b)&&(a<c);
	 System.out.println(value);
	 
	 value=(a>b)||(a<c);
	 System.out.println(value);
	 


	
	 }
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operatorsinjava operators = new Operatorsinjava();
		// operators.Arthameticoprations();
		// operators.relationaloperators();
		operators.logicaloperators();

	}

}

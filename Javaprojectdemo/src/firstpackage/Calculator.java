package firstpackage;

public class Calculator {

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void vlue(boolean value) {
System.out.println(value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		calculator.add(30, 100);
		calculator.add(200, 10);
		calculator.vlue(false);
		
		

	}

}

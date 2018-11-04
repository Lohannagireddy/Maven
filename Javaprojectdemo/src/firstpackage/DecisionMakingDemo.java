package firstpackage;

public class DecisionMakingDemo {
	public void ifdemo(int number){
		if(number%2==0)
			System.out.println("given number is even");
		
	}
	public void ifelsedemo(int number){
		if(number%2==0)
			System.out.println("given number is even");
		else
			System.out.println("odd number");
	}
public void ifelseifelse(int number){
	if(number==1)
		System.out.println("composite number");
	else if(number%2==0)
	System.out.println("even number");
	else
		System.out.println("odd number");
}	
public void switchdemo(int number){
	switch(number){
	
	case 1:System.out.println("jan");
	break;
	case 2:System.out.println("feb");
	break;
	case 3:System.out.println("mar");
	break;
	default:System.out.println("conversion of methods done");
	
}
}		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DecisionMakingDemo decisionmaking=new DecisionMakingDemo();
decisionmaking.ifdemo(10);
decisionmaking.ifelsedemo(11);
decisionmaking.ifelseifelse(11);
decisionmaking.switchdemo(12);

	}


		
	}



package firstpackage;

public class TypesofMethods {
	
	public void nonstaticmethod(){
		System.out.println("This is nonstatic method");
		
	}

	public static void staticMethod(){
		System.out.println("This is a static methos");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TypesofMethods.staticMethod();
TypesofMethods typesofmethods=new TypesofMethods();
typesofmethods.staticMethod();
typesofmethods.nonstaticmethod();
	}

}

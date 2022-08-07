package interfaceConcept;

public class ImplementationClass implements Interface1

{

	@Override
	public void method2() {
		System.out.println("interface method that we implement in implementation class  ");
		
	}

	public static void main(String[] args) {
		
		ImplementationClass intefacemethid = new ImplementationClass();
		intefacemethid.method3();
		Interface1.method1();
		
		intefacemethid.method2();
		
		
	}
}

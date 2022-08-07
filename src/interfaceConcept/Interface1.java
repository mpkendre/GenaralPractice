package interfaceConcept;

public interface Interface1 
{
	public static void method1()
	{
		System.out.println("its a static complete method ");
	}
	public void method2();
	
	public default void method3()
	{
		System.out.println("non static default method ");
	}

	public static void main(String[] args) {
		
		method1();

		
		
		
		
		// we can create 100% incomplete method in interface 
		//we can't create non static complete method here (we can't provide body to non static method )
		//we can right static method with body and we can run that methods in interface also
		// if you want to write non static full method in interface then you can use default keyword .. default void method()
		//we can write default method and static methods updated version i.e 1.8v and onward 
		
		
		
		
	}
}

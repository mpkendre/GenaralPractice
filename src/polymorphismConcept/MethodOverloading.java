package polymorphismConcept;

public class MethodOverloading 
{
	
	public static void method1()
	{
		System.out.println("static method with no argumrnt ");
	}
	
	public static void method1(int a)
	{
		System.out.println("static method with int argument ");
	}
	
	public void method2()
	{
		System.out.println("non static method with no argument ");
	}
     
	public void method2(int b)
	{
		System.out.println("non static method with int argument ");
	}
	
	public static void main(String[] args)
	{
		MethodOverloading x = new MethodOverloading();
		 x.method2();
		 x.method2(1);
		
		 
	}
}


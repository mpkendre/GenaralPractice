package abstractionOOPsConcept;

public class ImplementationClass implements Interface,Interface2
{

	@Override
	public void method6() 
	{
		// will do the implecit casting 
		int a=100;
		double b= (double)a;
		System.out.println(b);
	}

	@Override
	public void method7() 
	{
		double c=105.02541;
		int d= (int)c;
		System.out.println(d);
		
	}

	@Override
	public void method5() 
	{
		System.out.println("interface method ");
	}
	public static void main(String[] args) 
	{
		ImplementationClass x = new ImplementationClass();
		
		x.method5();
		x.method6();
		x.method7();
		
		
		
	}

}

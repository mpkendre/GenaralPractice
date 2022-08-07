package methodOverloading;

public class WithSameargument 
{
	public static void method1(int a , String b)
	{
		a=26;
		b="Makarand";
		System.out.println("Age of mk is -"+a+"  Name of client -"+b);
	}
	
	public static void method1(String a, int b)
	{
		a="Mukesh";
		b=24;
		System.out.println("Name of client is -"+a+"  Age of client is -"+b);
	}
	public static void main(String[] args) {
		
		WithSameargument.method1(0, "mak");
		WithSameargument.method1("Mak", 0);
	}

}

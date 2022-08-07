package methodOverloading;

public class MethodOverloadingWithDiffReturntype 
{
	
	public static void method1()
	{
		System.out.println("void return type");
	}
	
	public static int method1(int a)
	{
		a=20;
		System.out.println("integer type return type");
		return a;
	}
	public static String method1(String b)
	{
		b="Makarand";
		System.out.println("string type return type");
		return b;
	}
	
	public static void main(String[] args) {
		
		MethodOverloadingWithDiffReturntype all = new MethodOverloadingWithDiffReturntype();
		
		all.method1();
		all.method1(20);
		all.method1("Makarand");
	}

}

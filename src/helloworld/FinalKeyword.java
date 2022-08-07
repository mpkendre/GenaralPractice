package helloworld;

public  class FinalKeyword 
{
	public final void method1()
	{
		System.out.println("method with final keyword");
	}
	
	public void method1(int a)
	{
		System.out.println("final method overloading ");
	}
	public final void method1(int b,int c)
	{
		System.out.println("final method overloading");
	}
	public static void main(String[] args) {
		
		FinalKeyword x= new FinalKeyword();
		
		x.method1();
		x.method1(15);
		x.method1(10,20);
	}
	
	

}

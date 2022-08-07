package polymorphismConcept;

public class ChildClass extends ParrentClass
{
	int a =200;
	public void method1()
	{
		System.out.println("overriding of child class ");
	}
public static void main(String[] args) 
{
	ChildClass x = new ChildClass();
	
     System.out.println(x.a);
     
     x.method1();
	
     
}
}

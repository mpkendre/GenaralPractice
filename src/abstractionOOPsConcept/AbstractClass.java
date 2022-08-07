package abstractionOOPsConcept;

public abstract class AbstractClass 
{
	static int a=1500;
	
public static void method1()
{
	System.out.println("Abstract class -static method ");
}
public void method2()
{
	System.out.println("Abstract class - non static method ");
}

public static void main(String[] args) 
{
	
	method1();
	System.out.println("veriable of abstract class "+ a);
	//AbstractClass x= new AbstractClass();			// we cannot create the abstract class method because as per name abstract its incomplete class  
	
	
}




}

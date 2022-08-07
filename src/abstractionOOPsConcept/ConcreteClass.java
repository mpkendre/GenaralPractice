package abstractionOOPsConcept;

public class ConcreteClass extends AbstractMethod1			// for completing the abstract class 
															// we create concrete class ( concrete class is a normal class that we create to complete the abstract class 
{
	

	
//	x.method2();
//	x.method1();
//	System.out.println(x.a);
	
	
	


@Override
public void method3()
{
	int b=150;
	int c=100;
	int d= b+c;
	System.out.println(d);
}

@Override
public void method4() 
{
	int m=134;
	int n=5;
	int k=m/n;
	System.out.println(k);
	
}
public static void main(String[] args)
{
	ConcreteClass x = new ConcreteClass();
	x.method3();
	x.method4();

}


	
}

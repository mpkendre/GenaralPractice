package abstractionOOPsConcept;

public class ConstructorOverloading 
{
	
	ConstructorOverloading()
	{
		System.out.println("hi priya ");
	}
	
	ConstructorOverloading(String a)
	{
		System.out.println("khadus priya");
	}
	ConstructorOverloading(String b , String c)
	{
		System.out.println("hushar priya");
	}
	public static void main(String[] args) 
	
	{
		new ConstructorOverloading();;
		
		new ConstructorOverloading("piiyyuuu");
		
		new ConstructorOverloading("kalyani","kallu");

		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}

package constructor;

public class Test 
{
	String Name;
	int Marks,year;
	
//1	
	Test (){
		System.out.println ("student detail");
	}
	
	
//2	
	Test (String n)
	{
	Name = n;	
	}
	
//3	
	Test(int m,int y)
	{
		Marks=m;
		year=y;
	}
	
	public static void main(String[] args) {
		
		
		
		Test Student = new Test();
		
		Test Student1 = new Test("Makarand");
		
		Test Student2 = new Test(97,2019);
		
		System.out.println(Student1.Name);
		System.out.println(Student2.Marks+","+Student2.year);
	}
	
	
}

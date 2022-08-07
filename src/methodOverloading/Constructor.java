package methodOverloading;

public class Constructor 
{
	String StudentName ;
	int StudentAge;
	
	Constructor(String name ,int age)
	{
		StudentName = name ;
		StudentAge = age;
		
	}
	
	void student()
	{
		System.out.println("student name is -"+ StudentName+" "+"Student Age "+StudentAge);
	}
	public static void main(String[] args) {
		
		Constructor std = new Constructor("Mukesh",24);
		std.student();
		
	}

}

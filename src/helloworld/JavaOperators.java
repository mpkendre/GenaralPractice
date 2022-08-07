package helloworld;

public class JavaOperators {
	
public static void main(String[] args) 
{
	int a = 35;
	int b = 10;
	
	
	// Unary operators (++    ,    --)
	
	// two time plus means your data will increse by one 
	// two time minus symbol means your data value will decrease by one 
	
	
	
	a++;
	System.out.println(a);
	b++;
	System.out.println(b);
	
	a--;
	System.out.println(a);
	b--;
	System.out.println(b);
	
	int c = a+b ;
	
	//Arithmatic operators 
	
	//1. Addition
	
	System.out.println("Addition- " + c);
	
	//2. Subtraction
	
	System.out.println("Substraction- "+ (a-b));
	
	//3. Multiplication
	
	System.out.println("Multiplication- "+ (a*b));
	
	//4. Division Quotient
	System.out.println("Division- "+ (a/b));
	
	//5. DIvision Reminder
	
	System.out.println("DIvision -"+ (a%b));
	
	//6. COmaprision operators 
	
	// comparision operators are represent comparison between two data
	// and give output/result is in true and false 
	
	//7. Equal to
	System.out.println("equal "+(a==b));
	
	//8. Greater than
	 
	System.out.println("A is greater tahan -" +(a>b));
	
	
	//9Less than
	
	System.out.println("A is less tahn-"+(a<b));

	//10. Less than or equal to
	
	System.out.println(" A si less tahn or equal to-"+(a<=b));
	
	//11. Greater than or equal to
	System.out.println(" A is greater tahn equal to- "+(a>=b));
	
	//12. Not equal to
	
	System.out.println("A is not equal to-" +(a|=b));
	
	
}
}

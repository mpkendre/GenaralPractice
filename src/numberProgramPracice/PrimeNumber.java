package numberProgramPracice;

public class PrimeNumber
{

 public static void main(String[] args) 
 {

		
//	for ( int a=1;a<=100;a++);    //  i = 7
//	{
//		int count = 0;             //0
//		
//		for (int j=2;j<a;j++)      //j = 7
//		{
//			if (a%j==0)             //reminder = 
//		
//			count++;
//		}
//		if (count==0)
//		{
//			System.out.println("prime no "+a);
//		}
//		else 
//		{
//			System.out.println("Not a prime no "+a);
//		}
//	}
//	 
	 
	 
	 
 // prime no from 1 to 10
	 
	 
	for (int i=1;i<=10;i++)
	{
		int count = 0;
		
		for (int j=2;j<i;j++)
		{
			if (i%j==0)
			{
				count++;
			}
			
		}
		if (count ==0)
		{
			System.out.println(i+" - is a prime no");
		}
	}
 
 
 
 
 
 //ArmStrong Number 
 


     int number = 153;
     String num = "153";
    		int originalNumber, remainder;
    		double result = 0;

     originalNumber = number;

     while (originalNumber != 0)
     {
         remainder = originalNumber % 10;
         result += Math.pow(remainder, num.length());
         originalNumber /=10;
     }

     if(result == number)
         System.out.println(number + " is an Armstrong number.");
     else
         System.out.println(number + " is not an Armstrong number.");
 }

	 
	 
		  



//Palindrom number or string 


//   String Number = "525";
//   String Reverse = "";
//
//   for (int i=Number.length()-1;i>=0;i--)
//{
//	Reverse = Reverse+Number.charAt(i);
//
//}
//   if (Number.equals(Reverse))
//   {
//	   System.out.println(Number+" -is palindrom no");
//   }
  

 
   
   
   
 
 
}

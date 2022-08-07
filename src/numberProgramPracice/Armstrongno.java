package numberProgramPracice;

public class Armstrongno 
{
	public static void main(String[] args) {
		
		
//		public class Armstrongno
//		{
//		public static void main(String [] args)
//		{
		int number = 153;
		String num = "153";
		 int original;
		 int reminder ;
		 double result = 0;
		 
		 original = number;
		 
		 while(original!=0)
		 {
		 reminder = original % 10;
		 result = result + Math.pow(reminder,num.length());
		 original=original/10;
		 }
		 if(result==number)
		 
		 System.out.println(result + "is a armstong no");
		 
		 else
		 
		 System.out.println(result + "Is no a armstrong no");
		 
		 }
		 
	}



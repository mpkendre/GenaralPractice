package numberProgramPracice;

public class Palindromno 
{
	public static void main(String[] args)
	{
		int number = 454;
		int num ,reminder;
		double sum =0;
		
		num=number;
		
		while(number>0)
		{
			reminder = num%10;
			sum= (sum*10)+reminder;
			num = num/10;
		}
		if(sum==number)
		System.out.println("is palindrom no");
		
		System.out.println("makarand");
	}

}

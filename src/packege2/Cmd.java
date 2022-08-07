package packege2;

public class Cmd 
{
	public static void main(String[] args) 
	{
//		for (int i=0;i<=100;i++)
//		{
//			if(i%2==0)
//			{
//				System.out.println("even no "+i);
//			}
//			else
//			{
//				System.out.println("odd no "+i);
//			}
//		}
		
//		for(int i=1;i<=100;i++)
//		{int count =0;
//			for (int j=2;j<i;j++)
//			{
//				if (i%j==0)
//				{
//					count++;
//				}
//			}
//			if (count == 0)
//			{
//				System.out.println(i+"-is prime no");
//			}
//			else 
//			{
//				System.out.println(i+" -not prime no");
//			}
//		}
	
		
		
		
		int count;
		for (int i=1;i<=100;i++)
		{
		count = 0;
		for (int j=2;j<i;j++)
		{
		if (i%j==0)
		count++;
		}
		
	
		if(count ==0)
		{
		System.out.println("Its a prime no " +i);
		}
		else 
		{
		System.out.println("Its not a prime no " +i);
		}
		}
			
			
			
	}		
	}



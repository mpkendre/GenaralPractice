package starPattaern;

public class StarPattern1 
{
public static void main(String[] args) 
{
//	for ( int i=1;i<=5;i++)					// row define
//{
//	for (int j=4;j>=i;j--)
//	{
//		System.out.print(" ");			// space 
//	}
//	for (int k=1;k<=i;k++)				// star
//	{
//		System.out.print("*");
//	}
//	for ( int l=2;l<=i; l++)
//	{
//		System.out.print("*");			//star 
//		
//	}
//	System.out.println(" ");
//	
//}


for ( int a=1; a<=5;a++)
{
	for (int b=4;b>=a;b--)
	{
		System.out.print(" ");
	}
	for (int c=1;c<=(a);c++)			// for serial no = c<=a;  for odd no = c<=a*2-1 ;   for even no = c<=a*2
	{
		System.out.print("*");
	}
	System.out.println(" ");
}
		
		
	
		
		
		
		
		
		
		
		
		
		
}
}

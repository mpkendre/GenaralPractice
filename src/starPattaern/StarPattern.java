package starPattaern;

public class StarPattern 
{
	public static void main(String[] args) 
	{
//		for ( int i=1;i<=5;i++)
//		{
//			for (int j=4;j>=i;j--)
//			{
//				System.out.print(" ");
//			}
//			for (int k=1;k<=i;k++)
//			{
//				System.out.print("*");
//			}
//			for ( int l=2;l<=i; l++)
//			{
//				System.out.print("*");
//				
//			}
//			System.out.println(" ");
//			
//		}
//		
//			
//			for (int a=1;a<=4;a++)
//			{
//				
//			
//			for (int b=1;b<=a;b++)
//			{
//				System.out.print(" ");
//			}
//			for ( int c=4;c>=a; c--)
//			{
//				System.out.print("*");
//				
//			}
//			for (int d=4; d>=a;d--)
//			{
//				System.out.print("*");
//			}
//			System.out.println(" ");
//			}
//		
		
		for ( int x=1;x<=5;x++)
		{
			for ( int y=4;y>=x;y--)
			{
				System.out.print(" ");
			}
			for ( int z=1;z<=x; z++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for ( int m=1; m<=5;m++)
		{
			for (int n=1;n<=m;n++)
			{
				System.out.print(" ");
			}
			for (int k=4;k>=m;k--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	
	}
}


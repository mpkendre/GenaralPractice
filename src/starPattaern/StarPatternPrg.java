package starPattaern;

public class StarPatternPrg 
{
	public static void main(String[] args) {
		
		
		for (int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			//System.out.println();
			for (int k=2;k<=i*2;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}

}

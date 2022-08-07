package arrayConceptInJava;



public class ArrayPrograms 
{
	public static void main(String[] args) {
		
	
	// WAP for find the sum of an array	
		
//	int sum = 0;
//	int a[] = {5,10,15,20,25,30};
//	
//	for (int i=0;i<=a.length-1;i++)
//	{
//		sum = sum + a[i];
//	}
//	System.out.println(sum);
//	
	
	
	
	// WAP for find Avg of an array
	
//	int sum = 0;
//	
//	int[] a = {10,20,30,40,50};
//	
//	for (int i=0;i<a.length;i++)
//	{
//		sum = sum+a[i];
//	}
//	System.out.println("avg value of array is "+ sum/a.length);
//	
	
	
	
//	Scanner s =new Scanner(System.in);
//	
//	System.out.println("how many array element want to enter ");
//	
//	int n = s.nextInt();
//	
//	System.out.println("enter the array elemnt");
//	
//	int arr[]= new int[n];
//	
//	int sum = 0;
//	
//	for (int i=0;i<=n-1;i++)
//	{
//		arr[i] = s.nextInt();
//		sum= sum+arr[i];
//	}
//	System.out.println(sum/n);
	
		
		
		
		// WAP for finding max  and min value from array
		
		
		int a[]= {1,2,3,4,5,6,7};
		
		int min = a[5];    //6
		
		
		for ( int i=0;i<=a.length-1;i++)      // 0 1 2 3 4 5 6  index   
		{									  // 1 2 3 4 5 6 7  element
			if (a[i]< min)						
			{
				min = a[i];
			}
		}
		System.out.println(min);
		
		
		
	
	
	
	}
}

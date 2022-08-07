package constructor;

public class OverloadingTheConstructor 
{
	OverloadingTheConstructor(){
		//System.out.println("m");
	}
	
	OverloadingTheConstructor(int a){
		//System.out.println("a");
	}
	OverloadingTheConstructor(char a)
	{
		//System.out.println("k");
	}
	
	OverloadingTheConstructor(String a)
	{
		//System.out.println("k");
	}
	
	
	
	public static void main(String[] args) {
		
		 new OverloadingTheConstructor();
		 new OverloadingTheConstructor(20);
		 new OverloadingTheConstructor('B');
		 new OverloadingTheConstructor("Makarand");
		
		
		
		
	}

}

package encapsulationConcept;

public class EncapsulationClass 
{
	
	private String USernam;
	private int  MobileNO;
	private String Password;
	
	public void method1(String a)
	{
		setUSernam(a);
		System.out.println("Print the use name "+USernam);
	}
	
	public void method2(int b)
	{
		MobileNO = b;
		System.out.println("get mobile no");
	}
	
	public void method3(String c)
	{
		Password=c;
		System.out.println("get password value");
		
	}
	
	
	
	

	public String getUSernam() {
		return USernam;
	}

	public void setUSernam(String uSernam) {
		USernam = "Makarand";
		
	}

}

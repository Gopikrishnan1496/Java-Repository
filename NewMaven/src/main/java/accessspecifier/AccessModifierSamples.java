package accessspecifier;

public class AccessModifierSamples {
	public void display()
	{
		System.out.println("this is a public method");
	}
   
	private void display2()
	{
     System.out.println("this is a private method");
	}
	
	void display3()
	{
		System.out.println("This is default access specifier");
	}
	
	protected void display4()
	{
		System.out.println("This is proteceted access specifier ");
	}
	public static void main(String[] args) {
		
		AccessModifierSamples a=new AccessModifierSamples();
		a.display();
		a.display2();
		a.display3();
		a.display4();
		// TODO Auto-generated method stub

	}

}

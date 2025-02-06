package inheritance;

public class Childclass extends InheritanceSample1
{
	public void sub()
	{
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println(c);
	}
	public static void main (String args[])
	
	{
		Childclass obj1=new Childclass();
		obj1.sub();
		obj1.add();
		
	}

}

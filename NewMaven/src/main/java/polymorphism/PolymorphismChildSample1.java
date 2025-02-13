package polymorphism;

public class PolymorphismChildSample1 extends PolymorphismParentSample1 {

	public void add()
	{
		int a=50; int b=20;
		int c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	
	{   
		PolymorphismChildSample1 obj2=new PolymorphismChildSample1();
		obj2.add();
		PolymorphismParentSample1 obj1=new PolymorphismParentSample1();
		obj1.add();
		

	}

}

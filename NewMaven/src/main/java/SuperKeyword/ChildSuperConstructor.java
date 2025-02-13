package SuperKeyword;

public class ChildSuperConstructor extends SuperConstructor {
	public ChildSuperConstructor(String name) {
		super();
		System.out.println(name);
		
	}
	
	public static void main(String args[])
	{
		ChildSuperConstructor obj1=new ChildSuperConstructor("Gopikrishnan");
	}

}

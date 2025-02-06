package SuperKeyword;

public class ChildClass2 extends ParentClass2 {
	public void display1()
	{
		String name="NAME";
		System.out.println(name);
		super.display();
	}

	public static void main(String[] args) {
		ChildClass2 obj1=new ChildClass2();
		obj1.display1();
				
		// TODO Auto-generated method stub

	}

}

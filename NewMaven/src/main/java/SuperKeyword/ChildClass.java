package SuperKeyword;

public class ChildClass extends ParentClass {
	String color="blue";
	
	public void display()
	{
		
		System.out.println(color);
		System.out.println(super.color);
	}



	public static void main(String[] args) {
		ChildClass obj1=new ChildClass();
		obj1.display();
		// TODO Auto-generated method stub

	}

}

package inheritance;

public class MultilevelChild2 extends MultilevelChild
{
	public void div()
	{
		int p=80;
		int q=8;
		int r=p/q;
		System.out.println(r);
	}

	public static void main(String[] args) 
	{
		MultilevelChild2 obj1=new MultilevelChild2();
		obj1.add();
		obj1.sub();
		obj1.div();
		// TODO Auto-generated method stub

	}

}

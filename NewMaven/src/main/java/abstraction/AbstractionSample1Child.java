package abstraction;

public class AbstractionSample1Child extends AbstractionSample1 {

	public static void main(String[] args) {
		
		
		AbstractionSample1Child obj1=new AbstractionSample1Child();
		obj1.display();
		obj1.display2();
	}

	

	@Override
	public void display2() {
		System.out.println("this is an abstract method");
		// TODO Auto-generated method stub
		
	}
	
	

}

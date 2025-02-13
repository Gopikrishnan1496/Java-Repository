package interfacesample;

public class InterfaceChild1 implements InterfaceTest {//"implements" to get properties of parent interface

	public static void main(String[] args) {
		
		InterfaceChild1 obj1=new InterfaceChild1();
		obj1.display();
	}

	@Override
	public void display() {
		System.out.println("This is a sample interface ");
		// TODO Auto-generated method stub
		
	}

}

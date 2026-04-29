package interfaceexample;

public class Interface2 implements Interface1{
	public void show()
	{
		System.out.println("INTERFACE");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 obj=new Interface2();
		obj.display();
		obj.print();
		obj.show();
		//reference creation
		//When you use interface reference, you can only access methods defined in that interface.
		//Interface reference = interface-type variable referring to an implementing class object
		Interface1 obj1=new Interface2();
		obj1.display();
		obj1.print();
	}
	

	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("HELLO");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("HI");
	}

}

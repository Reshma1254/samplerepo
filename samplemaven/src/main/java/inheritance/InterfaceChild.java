package inheritance;

public class InterfaceChild implements InterfaceParent1,InterfaceParent2 {
	public void show()
	{
		System.out.println("This is InterfaceChild");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceChild obj=new InterfaceChild();
		obj.display();
		obj.print();
		obj.show();
		//REFERENCE
		//InterfaceParent1 obj2=new InterfaceChild();
		//obj2.print();
		//obj2.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is interfaceparent2");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("This is interfaceparent1");
	}
//multiple inheritance
}

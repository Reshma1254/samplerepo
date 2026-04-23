package superkeyword;

public class SuperMethodChild extends SuperMethodParent {
	public void print()
	{
		System.out.println("This is supermethod child");
		super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethodChild obj3=new SuperMethodChild();
		obj3.print();
	}

}

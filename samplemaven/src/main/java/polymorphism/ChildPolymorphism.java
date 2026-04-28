package polymorphism;

public class ChildPolymorphism extends ParentPolymorphism {
	public void display()
	{
		System.out.println("THIS IS POLYMORPHISM CHILD");
		super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildPolymorphism obj=new ChildPolymorphism();
		obj.display();
	}

}

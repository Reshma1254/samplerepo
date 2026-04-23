package inheritance;

public class HeirarchialChild2 extends HeirarchialParent {
	public void print()
{
		System.out.println("this is child2");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeirarchialChild2 obj=new HeirarchialChild2();
		obj.print();
		obj.display();
		

	}

}

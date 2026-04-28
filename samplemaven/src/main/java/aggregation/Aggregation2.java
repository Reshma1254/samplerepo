package aggregation;

public class Aggregation2 {
	String city,state;
	Aggregation1 ref;
	public Aggregation2(String city,String state,Aggregation1 ref)
	{
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	public void display()
	{
	System.out.println(ref.name);
	System.out.println(ref.rollno);
	System.out.println(ref.address);
	System.out.println(city);
	System.out.println(state);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregation1 obj=new Aggregation1("RESHMA",44,"CTK");
		Aggregation2 obj1=new Aggregation2("ALPY","KERALA",obj);
		obj1.display();
	}

}

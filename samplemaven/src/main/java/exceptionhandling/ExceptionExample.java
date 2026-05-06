package exceptionhandling;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		try {
		
		int c=a/b;
		}
		catch(ArithmeticException e)
		{
			b=2;
			int c=a/b;     //try il ulla declare c catch il varilla so declare c again in catch ,catch il kodukkunna variable e try block ile exception details hold cheyyum
			
			System.out.println(c);
			System.out.println(e);
		}
		finally  //mandatory run if handled or not
		{
		System.out.println("mandatory code");
		
		
	}
}
}


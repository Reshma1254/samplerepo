package exceptionhandling;

public class CustomAge {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		int age=9;
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			throw new AgeException("age under 18!");//enter any class as per need here we create voting exception class and constryuvcter
		}
		

	}

}

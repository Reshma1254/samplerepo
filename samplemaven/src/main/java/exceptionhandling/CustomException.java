package exceptionhandling;

public class CustomException {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
		int age=9;
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			throw new VotingException("age under 18!");//enter any class as per need here we create voting exception class and constryuvcter
		}
		
	}

}

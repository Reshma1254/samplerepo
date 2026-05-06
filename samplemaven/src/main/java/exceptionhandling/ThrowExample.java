package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=9;
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			throw new ArithmeticException("age under 18!!!");//exception aaitt varum else excecute cheyyumbol instead of output statement use ant unchecked exception after new
		}
		

	}

}

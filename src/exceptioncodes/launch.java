package exceptioncodes;
import java.util.Scanner;

public class launch 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter numerator");
			int num1=sc.nextInt();
			System.out.println("enter denominator");
			int num2=sc.nextInt();
			int numerator = 10 ;
			int denominator=5;
			int res=numerator/denominator;
			System.out.println(res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException is generated");
		}
		
	}

}

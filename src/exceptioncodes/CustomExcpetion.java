package exceptioncodes;
import java.util.Scanner;
class UnderAgeException extends Exception
{
	public String getMessage()
	{
		return"you are still a kid .please grow up";
	}
}

class OverAgeException extends Exception
{
	public String getMessage()
	{
		return"please control your emotion.you are a senior citizen";
	}
}
class Candidate
{
	int age;
	void collectData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		age=sc.nextInt();
	}
	void verify() throws UnderAgeException,OverAgeException
	{
		if(age<21)
		{
			UnderAgeException uae=new UnderAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		}
		if(age>60)
		{

			OverAgeException oae=new OverAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		}
		else
		{
			System.out.println("eligible fo marrigae");
		}
	}
}
public class CustomExcpetion 
{
 public static void main(String[] args) 
 {
	 try
	 {
		 Candidate c1=new Candidate();
		 c1.collectData();
		 c1.verify();
	 }
	catch(OverAgeException|UnderAgeException e)
	 {
		System.out.println("exception handled in main");
	 }
}

}

package Threads;
import java.util.Scanner;
class Addition2 implements Runnable
{
	public void run()
	{
		System.out.println("addition2 operation");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1");
		int num1=sc.nextInt();
		System.out.println("enter num2");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println(res);
		System.out.println("addition2 completed");
		System.out.println("printing2 operation");
	}
}
	class Printing2 implements Runnable
	{
		public void run()
		{
			System.out.println("addition2 operation");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter num1");
			int num1=sc.nextInt();
			System.out.println("enter num2");
			int num2=sc.nextInt();
			int res=num1+num2;
			System.out.println(res);
			System.out.println("addition2 completed");
			System.out.println("printing2 operation");
		}
	}
		class banking2 implements Runnable
		{
			public void run()
			{
				System.out.println("addition2 operation");
				Scanner sc=new Scanner(System.in);
				System.out.println("enter num1");
				int num1=sc.nextInt();
				System.out.println("enter num2");
				int num2=sc.nextInt();
				int res=num1+num2;
				System.out.println(res);
				System.out.println("addition2 completed");
				System.out.println("printing2 operation");
			}

		}

public class Launch1  
{
	public static void main(String[] args)
	{
	System.out.println("main stared");
	Addition2 ad=new Addition2();
	System.out.println(ad);
	Printing2 pr=new Printing2();
	System.out.println(pr);
	banking2 bn=new banking2();
	System.out.println(bn); 
	
	Thread t1=new 	Thread(ad);
	Thread t2=new 	Thread(pr);
	Thread t3=new 	Thread(bn);
	
	t1.start();
	t2.start();
	t3.start();
	System.out.println("main terminated");
	}
}
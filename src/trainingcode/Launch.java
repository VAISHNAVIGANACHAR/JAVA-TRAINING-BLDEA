package trainingcode;
interface Calculator
{
	void add();
	void sub();
}
abstract class Calcy1 implements Calculator
{
	@Override
	public void add()
	{
		System.out.println("add-1");
	}
}
abstract class Calcy2 implements Calculator
{
	@Override
	public void add()
	{
		System.out.println("add-2");
	}
	@Override
	public void sub()
	{
		System.out.println("sub-2");
	}
}
public class Launch 
{
	public static void main(String[] args) 
	{
		Calculator c=new Calculator()
		{
			@Override
			public void add()
			{
			}
			@Override
			public void sub() 
			{
			
			}
			};
	System.out.println(c);
	Calcy1 c1=new Calcy1()
	{
		public void sub()
		{

		}
	};
	System.out.println(c);

}
}

package trainingcode;
class Dog1
{
	private String name;
	private String color;
	private int cost;
	
	public Dog1()
	{
		super();
	}
	
	public Dog1(String name)
	{
		super();
		this.name=name;
	}
	
	public Dog1(String name,String color)
	{
		super();
		this.name=name;
		this.color=color;
	}
	
	public Dog1(String name,String color,int cost)
	{
		super();
		this.name=name;
		this.color=color;
		this.cost=cost;
	}
	public String getname()
	{
		return name;
	}

	public String getcolor()
	{
		return color;
	}
	public int getcost()
	{
		return cost;
	}
}

public class lanunch4 
{
	public static void main(String[] args) 
	{
	Dog1 d1=new Dog1();
	System.out.println(d1.getname());
	System.out.println(d1.getcolor());
	System.out.println(d1.getcost());
	
	Dog1 d2=new Dog1("Rocky");
	System.out.println(d2.getname());
	System.out.println(d2.getcolor());
	System.out.println(d2.getcost());
	
	Dog1 d3=new Dog1("Rocky","white");
	System.out.println(d3.getname());
	System.out.println(d3.getcolor());
	System.out.println(d3.getcost());
	
	Dog1 d4=new Dog1("tommy","brown",7000);
	System.out.println(d4.getname());
	System.out.println(d4.getcolor());
	System.out.println(d4.getcost());
	}

}

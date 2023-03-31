package trainingcode;
class tiger
{
	private String name;
	private String color;
	private int age;
	private String country;
	
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	
	public String getcolor()
	{
		return color;
	}
	public void setcolor(String color)
	{
		this.color=color;
	}
	public int getage()
	{
		return age;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public String getcountry()
	{
		return country;
	}
	public void setcountry(String country)
	{
		this.country=country;
	}
	
}

public class lanunch3 {

	public static void main(String[] args) 
	{
		tiger t1=new tiger();
		t1.setname("ramu");
		t1.setcolor("orange");
		t1.setage(5);
		t1.setcountry("india");
		System.out.println(t1.getname());
		System.out.println(t1.getcolor());
		System.out.println(t1.getage());
		System.out.println(t1.getcountry());
	}
}

		


	



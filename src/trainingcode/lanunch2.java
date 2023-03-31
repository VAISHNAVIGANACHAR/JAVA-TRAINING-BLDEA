package trainingcode;
class Dog
{
	private String name;
	private String color;
	private int cost;

    void setData(String a,String b,int c) 
    {
      name=name;
      color=color;
      cost=cost;
    }
     
    void getData()
    {
    	System.out.println(name);
    	System.out.println(color);
    	System.out.println(cost);
    }
   
    }

public class lanunch2 
{
	public static void main(String[] args) 
	{
		Dog d1=new Dog();
		d1.setData("blacky","black",7000);
		d1.getData();
		
	}

}

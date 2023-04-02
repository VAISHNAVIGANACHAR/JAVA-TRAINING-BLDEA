package trainingcode;
class cat
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
		cat c1=new cat();
		c1.setData("blacky","black",7000);
		c1.getData();
		
	}

}

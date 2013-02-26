class mixStart
{
	public boolean mixStart(String str) 
	{
  		if(str.length()>=3 && str.substring(1,3).equals("ix"))
  			{
  			return true;
  			}
  		else
  			return false;
	}
}
public class testmixStart
{
	public static void main(String args[])
	{
	mixStart m=new mixStart();
	System.out.println(m.mixStart("mix snacks"));
	}
}
class nearHundred
{
public boolean nearHundred(int n) 
	{
	
  	return ((Math.abs(100 - n) <= 10) ||
    	(Math.abs(200 - n) <= 10));
	}
}
class TestnearHundred
{
public static void main(String args[])
	{
	nearHundred n=new nearHundred();
	System.out.println(n.nearHundred(89));
	}
}
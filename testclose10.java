class close10
{
	public int close10(int a, int b) 
	{
  		if(Math.abs(a-10)==Math.abs(b-10))
  			{
  			return 0;
  			}
  		else
  			return (Math.abs(a-10)<Math.abs(b-10))?a:b;
	}
}

class testclose10
{
public static void main(String args[])
	{
	close10 c=new close10();
	System.out.println(c.close10(11,13));
	}
}
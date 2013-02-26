class in3050
{
	public boolean in3050(int a, int b) 
	{
  		if((a >= 30 && a <= 40 && b >= 30 && b <= 40)||(a >= 40 && a <= 50 && b >= 40 && b <= 50))
   		{
    			return true;
		}
  
  		return false;
	}

}

class testin3050
{
public static void main(String args[])
	{
	in3050 i=new in3050();
	System.out.println(i.in3050(31,29));
	}
}
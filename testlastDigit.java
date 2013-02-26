class lastDigit
{
	public boolean lastDigit(int a, int b) 
	{
  		if(a%10==b%10)
  		{
		return true;
		}
  		else
  		return false;
	}

}

class testlastDigit
{
public static void main(String args[])
	{
	lastDigit l=new lastDigit();
	System.out.println(l.lastDigit(14,24));
	}
}
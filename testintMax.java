class intMax
{
	public int intMax(int a, int b, int c) 
	{
  		return a>b?a>c?a:c:b>c?b:c;
	}
}

public class testintMax
{
	public static void main(String args[])
	{
	intMax i=new intMax();
	System.out.println(i.intMax(1,7,3));
	}
}
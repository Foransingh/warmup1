class sumDouble
{
	public int sumDouble(int a, int b) 
	{
		return a==b?2*(a+b):a+b; 
	}
}

public class testsumDouble
{
	public static void main(String args[])
	{
	sumDouble s=new sumDouble();
	System.out.println(s.sumDouble(2,2));
	}
}
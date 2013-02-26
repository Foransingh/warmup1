class in1020
{
	public boolean in1020(int a, int b) 
	{
  		return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
	}
}

public class testin1020
{
	public static void main(String args[])
	{
	in1020 i=new in1020();
	System.out.println(i.in1020(2,7));
	}
}
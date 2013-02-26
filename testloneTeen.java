class loneTeen
{
public boolean loneTeen(int a, int b) 
	{
		boolean a1=(a<=19&&a>=13);
		boolean b1=(b<=19&&b>=13);
		if(a1!=b1)
		{
		return true;
		}
		else
		return 
		false;
	}
}
class testloneTeen
{
public static void main(String args[])
	{
	loneTeen l=new loneTeen();
	System.out.println(l.loneTeen(12,21));
	}
}
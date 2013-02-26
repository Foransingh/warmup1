class diff21
{
public int diff21(int n)
	{
 	return n>21?2*(n-21):21-n;
	}
}
public class diff21test
{
public static void main(String args[])
	{
	diff21 d=new diff21();
	System.out.println(d.diff21(31));
	}
}
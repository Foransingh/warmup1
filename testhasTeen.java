class hasTeen
{
public boolean hasTeen(int a, int b, int c) 
	{
	return (a>=13 && a<=19) ||
         (b>=13 && b<=19) ||
         (c>=13 && c<=19);
	}
}
public class testhasTeen
{
public static void main(String args[])
	{
	hasTeen h=new hasTeen();
	System.out.println(h.hasTeen(3,17,1));
	}
}
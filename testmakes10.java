class makes10
{
public boolean makes10(int a, int b) 
  {
  if(a+b==10||a==10||b==10)
  {
  return true;
  }
  else
  return false;
  }
}
public class testmakes10
{
	public static void main(String args[])
	{
	makes10 m=new makes10();
	System.out.println(m.makes10(2,3));
	}
}
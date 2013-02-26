class backAround
{
	public String backAround(String str) 
	{
   		String last = str.substring(str.length() - 1);
  		return last + str + last;
	}
}
public class testbackAround
{
public static void main(String args[])
	{
		backAround b=new backAround();
		System.out.println(b.backAround("foran"));
	}
}
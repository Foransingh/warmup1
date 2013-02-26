class startHi
{
	public boolean startHi(String str) 
	{
	if(str.length()>=2)
		{
		String substr=str.substring(0,2);
  		if(substr.equals("hi"))
  			{
	  		return true;
  			}
  		else
  			return false;
 		}
 	else
 		return false;
	}
}
public class teststartHi
{
	public static void main(String args[])
	{
	startHi s=new startHi();
	System.out.println(s.startHi("foran"));
	}
}
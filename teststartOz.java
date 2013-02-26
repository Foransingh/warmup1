class startOz
{
	public String startOz(String str) 
	{
  	if(str.length()>=1)
  		{
  		if(str.length()>1 && str.charAt(0)=='o'&& str.charAt(1)=='z')
  			{
  			return "oz";
  			}
  		else if(str.charAt(0)=='o')
  			{
			return "o";
			}
  		else if(str.charAt(1)=='z')
  			{
			return "z";
			}
  			return "";
  		}
  	else
  		return "";
 
	}
}

public class teststartOz
{
	public static void main(String args[])
	{
	startOz s=new startOz();
	System.out.println(s.startOz("bzoo"));
	}
}
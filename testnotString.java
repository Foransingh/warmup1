class notString
{
	public String notString(String str) 
		{
  			if(str.length()>=3)
  				{
  				String check=str.substring(0,3);
  				if(check.equals("not"))
  				{
 		 		return(str);
  				}
  				else
 				return("not "+str);
  				}
  			else
  			return "not "+str;
		}
}
public class testnotString
{
public static void main(String args[])
	{
	notString s=new notString();	
	System.out.println(s.notString("x"));
	}
}
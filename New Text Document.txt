class endUp
{
	public String endUp(String str) 
	{
  		if(str.length()>3)
  		{
  			String end=str.substring(str.length()-3,str.length());
  			end=end.toUpperCase();
		  	String front=str.substring(0,str.length()-3);
  			return front+end;
  		}
  		else
			return str.toUpperCase();
	}
}

public class testendUp
{
public static void main(String args[])
	{
	endUp e=new endUp();
	System.out.println(e.endUp("foran"));
	}
}
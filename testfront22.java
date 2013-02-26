class front22
{
	public String front22(String str) 
	{
		if(str.length()>=2)
			{
			String substr1=str.substring(0,2);
			return substr1+str+substr1;
			}
 		else
  			return str+str+str;
	}
}

public class testfront22
{
public static void main(String args[])
	{
	front22 f=new front22();
	System.out.println(f.front22("foran"));
	}
}
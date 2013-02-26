class everyNth
{	public String everyNth(String str, int n) 
	{
 		String result="";
  		for(int r=0;r<str.length();r=r+n)
  		{
   			result=result+str.charAt(r);
  		}
  		return result;
	}
}

public class testeveryNth
{
public static void main(String args[])
	{
	everyNth e=new everyNth();
	System.out.println(e.everyNth("foran",2));
	}
}
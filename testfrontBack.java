class frontBack
{
	public String frontBack(String str) 
	{
  		if (str.length() <= 1) return str;
    		String mid = str.substring(1, str.length()-1);
  		return str.charAt(str.length()-1) + mid + str.charAt(0);
	}
}
public class testfrontBack
{
public static void main(String args[])
	{
	frontBack f=new frontBack();
	System.out.println(f.frontBack("foran"));
	}
}
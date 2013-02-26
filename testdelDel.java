class delDel
{
	public String delDel(String str) 
	{
  		if(str.length()>=4)
  			{
 			String str1=str.substring(1,4);
  			if(str1.equals("del"))
  				{
 				String front=str.substring(0,1);
  				String back=str.substring(4,str.length());
  				return front+back;
  				}
  			else
  				return str;
  			}
  		else
  		return str;
	}
}
public class testdelDel
{
public static void main(String args[])
	{
	delDel d=new delDel();
	System.out.println(d.delDel("fdeloran"));
	}
}
class front3
{
public String front3(String str) 
	{
  	String front;
  	if(str.length()>=3)
  		{
  			front=str.substring(0,3);
 		 }
 	 else
  		{
  			front=str;
 		 }
 	 return front+front+front;
	}
}
public class testfront3
{
public static void main(String args[])
	{
	front3 f=new front3();
	System.out.println(f.front3("foran"));
	}
}
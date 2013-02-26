class sleep
{
public boolean sleepIn(boolean weekday, boolean vacation) 
{
  if (!weekday || vacation) 
	{
    	return true;
  	}
  
  	return false;
}
}


public class sleeptest
{
public static void main(String args[])
	{
	sleep s=new sleep();
	System.out.println(s.sleepIn(true,false));
	}
}

/*we can pass boolean data type from main without specifying data type*/


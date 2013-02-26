class stringE
{
	public boolean stringE(String str) 
	{
		int count=0;
  		for(int i=0;i<str.length();i++)
  		{
  			if (str.charAt(i) == 'e') count++;
  		}
 		 return (count >= 1 && count <= 3);
	}
}

class teststringE
{
public static void main(String args[])
	{
	stringE s=new stringE();
	System.out.println(s.stringE("hello"));
	}
}
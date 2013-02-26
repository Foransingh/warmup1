class max1020
{
	public int max1020(int a, int b) 
	{
  	if(a>b)
  	{
  		if(a>=10 && a<=20)
  		{
  		return a;
  		}
  		else if(b>=10 && b<=10)
  		{return b;}
  		else
  		return 0;
  		}
  	else
  		if(b>=10&& b<=20)
 		 {return b;}
 		 else if(a>=10 && a<=20)
  		 {return a;}
  		 else
		 return 0;
	}
}

class testmax1020
{
public static void main(String args[])
	{
	max1020 m=new max1020();
	System.out.println(m.max1020(20,10));
	}
}
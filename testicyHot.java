class icyHot
{
public boolean icyHot(int temp1, int temp2) 
	{
	int a=Math.abs(temp1)+Math.abs(temp2);
	int b=temp1+temp2;
	if(b<a)
	{
		if((temp1<0&&temp2>100)||(temp2<0&&temp1>100))
		{
		return true;
		}
		else
		return false;
	}
	else
	return false;
	}
}
class testicyHot
{
public static void main(String args[])
	{
	icyHot i=new icyHot();
	System.out.println(i.icyHot(1,1));
	}
}
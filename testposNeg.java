class posNeg
{
	public boolean posNeg(int a, int b, boolean negative) 
	{
	return  negative==true?(a<0 && b<0? true:false):((a<0&&b>0)||(a>0 && b<0))?true:false;
	}

}

public class testposNeg
{
	public static void main(String args[])
		{
		posNeg p=new posNeg();
		System.out.println(p.posNeg(4,-3,false));
		}
}

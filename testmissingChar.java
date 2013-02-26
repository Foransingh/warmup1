class missingChar
{
	String missingChar(String str, int n)
	{
	String front = str.substring(0, n);
	String back = str.substring(n+1, str.length());
	return front + back;
	}
}

class testmissingChar
{
public static void main(String args[])
	{
	missingChar m=new missingChar();
	System.out.println(m.missingChar("foran",1));
	}
}
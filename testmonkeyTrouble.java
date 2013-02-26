class monkeyTrouble
{
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) 
	{
		if(aSmile==bSmile)
		{
		return true;
		}
		else
		return false;
  
	}

}
public class testmonkeyTrouble
{
	public static void main(String args[])
	{
	monkeyTrouble m=new monkeyTrouble();
	System.out.println(m.monkeyTrouble(true,false));	
	}
}
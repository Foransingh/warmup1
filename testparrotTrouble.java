class parrotTrouble
{
	public boolean parrotTrouble(boolean talking, int hour) 
		{
  		boolean hour1=((hour>=0 && hour<7)||(hour>20 && hour<=23));
  		if(talking==true && hour1==true)
  		{
  		return true;
  		}
  		else
  		return false;
		}
}
public class testparrotTrouble
{
	public static void main(String args[])
		{
		parrotTrouble p=new parrotTrouble();
		System.out.println(p.parrotTrouble(true,5));
		}
}
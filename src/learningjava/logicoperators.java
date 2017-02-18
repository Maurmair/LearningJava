package learningjava;
import java.util.*;

public class logicoperators 
{
	public static void main (String args[])
	{
		int boy, girl;
		boy = 18;
		girl = 99;
		
		if (boy >10 || girl < 60) // &&: beide moeten waar zijn, ||: een van beide moet waar zijn
		{
			System.out.println("You can enter");
		}
		else
		{
			System.out.println("Requirements not met");
		}
		
	}
}

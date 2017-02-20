package learningjava;
import java.util.Scanner;

public class manymethodsninstancesOne 
{

	public static void main (String args[])
	{
		Scanner input = new Scanner (System.in);
		manymethodsninstances manymethodsninstancesObject = new manymethodsninstances();
		System.out.println("Enter name of to be wife here: ");
		String tempName = input.nextLine();
		
		manymethodsninstancesObject .setName(tempName);
		manymethodsninstancesObject.saying();
	}
	
}

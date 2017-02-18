package learningjava;
import java.util.Scanner;

public class apple 
{
	public static void main (String args[])
	{
		Scanner wes = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first number: ");
		fnum = wes.nextDouble();
		System.out.println("Enter second number: ");
		snum = wes.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
		System.out.println("Hey there");
		
		
	}
}

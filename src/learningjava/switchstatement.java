package learningjava;
import java.util.*;


public class switchstatement {

	public static void main (String args[]){
		int age = 5;
		
		switch(age){
		case 1:
			System.out.println("You can crawl?");
			break;
		case 2:
			System.out.println("You can talk?");
			break;
		case 3:
			System.out.println("You can get in trouble");
			break;
		default:
			System.out.println("No case is met");
		break;
		}
		
	}
}
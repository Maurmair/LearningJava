package learningjava;
import java.util.*;

public class methodparam {

	public static void main (String args[]){
		Scanner input = new Scanner(System.in);

		methodparamone methodparamoneObject = new methodparamone();
		System.out.println("Wat is je naam?");
		String name = input.nextLine();
		methodparamoneObject.simpleMessage(name);
	}
}

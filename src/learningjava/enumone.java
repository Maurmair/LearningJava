package learningjava;
import java.util.EnumSet;


public class enumone {
	public static void main (String args[]){
		for (enumeration people: enumeration.values()){
			System.out.printf("%s\t %s\t %s\n",people, people.getDesc(), people.getYear()  );
		}
		System.out.println("\nAnd now for the range of constants!! \n");
		
		for (enumeration ppl: EnumSet.range(enumeration.nora, enumeration.anne) ){
			System.out.println("\nAnd now for the range of constants!! \n");
		}
			
	}
}

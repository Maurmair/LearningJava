package learningjava;

public class enumone {
	public static void main (String args[]){
		for (enumeration people: enumeration.values()){
			System.out.printf("%s\t %s\t %s\n",people, people.getDesc(), people.getYear()  );
		}
	}
}
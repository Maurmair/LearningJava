package learningjava;

public class statischone {
	public static void main (String args[]){
		
		statisch mone = new statisch("Wes","Maurmair");
		statisch mtwo = new statisch("Nora","Miessen");
		statisch mthree = new statisch("Mitch","Maurmair");
		
		System.out.println();
		System.out.println(mone.getFn());
		System.out.println(mone.getLn());
		System.out.println(mone.getMembers()); // will be the same for all instances
		
		System.out.println();
		System.out.println(mtwo.getFn());
		System.out.println(mtwo.getLn());
		System.out.println(mtwo.getMembers()); // will be the same for all instances
		
		System.out.println();
		System.out.println(mthree.getFn());
		System.out.println(mthree.getLn());
		System.out.println(mthree.getMembers()); // will be the same for all instances
		
	}
}

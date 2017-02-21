package learningjava;

public class timestwo {
	public static void main (String args[]){
		multipleconstructors timeone = new multipleconstructors();
		multipleconstructors timetwo = new multipleconstructors(5);
		multipleconstructors timethree = new multipleconstructors(5,13);
		multipleconstructors timefour = new multipleconstructors(5,13,2);
		
		
		System.out.printf("%s\n",timeone.toMilitary());
		System.out.printf("%s\n",timetwo.toMilitary());
		System.out.printf("%s\n",timethree.toMilitary());
		System.out.printf("%s\n",timefour.toMilitary());
	}

}

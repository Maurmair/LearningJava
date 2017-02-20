package learningjava;

public class nestedif {
	public static void main(String args[]){
		int age = 60;
		if (age < 50){
			System.out.println("Je bent jong");
		}else{
			System.out.println("Je bent oud");
			if (age > 75){
				System.out.println("Je bent echt oud");
			}else{
				System.out.println("Maak je geen zorgen, je bent nog niet superoud");
			}
		}
	}
}

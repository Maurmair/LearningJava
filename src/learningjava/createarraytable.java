package learningjava;

public class createarraytable {
	public static void main(String args[]){
		System.out.println("Index\tValue");
		int wes[] = {28, 24,1,22,55};
		for (int counter =0;counter<wes.length;counter++){
			System.out.println(counter + "\t" + wes[counter] );
		}
	}
}

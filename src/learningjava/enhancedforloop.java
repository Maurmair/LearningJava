package learningjava;

public class enhancedforloop {
	public static void main(String args[]){
		int wes[] = {3,4,5,6,7,8,9}; 
		int total = 0;
		
		for (int x: wes){
			total +=x;
		}
		System.out.println(total);
	}
}

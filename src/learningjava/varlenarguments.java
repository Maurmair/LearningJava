package learningjava;

public class varlenarguments {
	public static void main(String args[]){
		
		System.out.println(average(23,4,55,1,12,33,11,45,77,66,23) );
		
	}
	
	public static int average(int...numbers){
		int total=0;
		for (int x: numbers){
			total+=x;
		}
		return total/numbers.length;
	}
}

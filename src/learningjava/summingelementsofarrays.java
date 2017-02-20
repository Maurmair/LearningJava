package learningjava;

public class summingelementsofarrays {
	public static void main(String args[]){
		int wes[] = {28,23,12,43,56,33};
		int sum = 0;
		for (int counter = 0; counter < wes.length; counter++){
			sum += wes[counter];
		}
		System.out.println("The sum of the numbers in the Array Wes is: " + sum);
	}
}

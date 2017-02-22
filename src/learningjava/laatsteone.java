package learningjava;

public class laatsteone {
	private int sum;
	private final int NUMBER; //no longer modifiable
	
	public laatsteone(int x){
		NUMBER = x;
	}
	
	public void add(){
		sum += NUMBER;
	}
	
	public String toString(){
		return String.format("Sum = %d\n", sum);
	}
}

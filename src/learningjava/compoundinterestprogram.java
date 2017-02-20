package learningjava;

public class compoundinterestprogram {
	public static void main(String args[]){
		// A=P(1+R)^n
		double amount;
		double principle = 10000;
		double rate = .01;
		for (int day = 1;day <=20;day++){
			amount = principle * Math.pow(1 + rate , day);
			System.out.println(day + "    " + amount);
		}
		
	}
}

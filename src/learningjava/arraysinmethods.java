package learningjava;

public class arraysinmethods {
	public static void main(String args[]){
		int wes[]={1,2,3,4,5,6,7,8,9};
		change(wes);
		for (int y:wes){
			System.out.println(y);
		}
	}
	
	public static void change(int x[]){
		for (int counter=0; counter<x.length; counter++){
			x[counter]+= 5;
		}
	}
}

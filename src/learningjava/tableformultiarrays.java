package learningjava;

public class tableformultiarrays {
	public static void main(String args[]){
		int firstarray[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int secondarray[][]={{30,31,32},{34},{35,36}};
		System.out.println("This is the first array");
		display(firstarray);
		System.out.println("This is the second array");
		display(secondarray);
	}
	
	public static void display(int x[][]){
		 for (int row = 0;  row<x.length; row++){
			 for (int col = 0; col <x[row].length; col++){
				 System.out.print(x[row][col] + "\t");
			 }
			 System.out.println();
		 }
	}
}

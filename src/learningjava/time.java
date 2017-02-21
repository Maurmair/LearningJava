package learningjava;

public class time {
	public static void main(String args[]){
		timeclass testtimeclass = new timeclass();
		
		//testtimeclass.setTime(14, 17, 2);
		System.out.println(testtimeclass.toString());
		
		testtimeclass.setTime(13, 27, 6);
		System.out.println(testtimeclass.toMilitary());
		System.out.println(testtimeclass.toString());
	}
}

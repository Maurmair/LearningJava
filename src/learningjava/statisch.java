package learningjava;

public class statisch {
	private String first;
	private String last;
	
	private static int members = 0; // will be shared for all instances of classes
	
	public statisch(String fn, String ln){
		first = fn;
		last = ln;
		
		members++;
		System.out.printf("Constructor for %s %s, members in the club: %d\n ", first, last, members);
	}
	
	public String getFn(){
		return first;
	}
	
	public String getLn(){
		return last;
	}
	
	public static int getMembers(){
		return members;
	}
	
	
	
}

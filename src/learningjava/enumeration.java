package learningjava;

public enum enumeration {
	wes("Good", "28"),
	nora("Love", "24"),
	mitch("Brother", "23"),
	olli("schoonbroer", "23"),
	candy("paard", "21"),
	anne("jaja", "27");
	
	private final String desc;
	private final String year;
	
	enumeration(String description, String birthday){
		desc = description;
		year = birthday;
	}
	public String getDesc(){
		return desc;
	}
	
	public String getYear(){
		return year;
	}
}

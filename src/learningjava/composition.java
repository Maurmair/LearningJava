package learningjava;

public class composition {
	private String name;
	private toostring birthday;
	
	public composition(String theName, toostring theDate){
		name = theName;
		birthday = theDate;
	}
	
	public String toString(){
		return String.format("My name is: %s, my birthday is: %s", name, birthday);
	}
}

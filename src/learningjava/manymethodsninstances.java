package learningjava;

public class manymethodsninstances {
	private String girlName;
	public void setName (String name)
	{
		girlName = name;
	}
	public String getName(String name)
	{
		return girlName;
	}
	
	public void saying()
	{
		System.out.printf("Your to be wife is %s", getName(girlName));
	}
}

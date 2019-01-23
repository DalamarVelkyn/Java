public class Person
{
	private String name;
	private double age;
	
	public Person()
	{
		name = "XXX";
		age = 0;		
	}
	
	public void setPersonName(String person)
	{
		name = person;
	}
	
	public void setPersonAge(double ag)
	{
		age = ag;
	}
	
	public String getPersonName()
	{
		return name;
	}
	
	public double getPersonAge()
	{
		return age;
	}
}
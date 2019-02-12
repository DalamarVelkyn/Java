public class Student 
{

    private String name;
	private String surname;
	
    public Student(String n, String s)
	{
		name = n;
		surname = s;
	}
	
	public String toString()
	{
		return(name + " " + surname);
	}
	
	public Student deepCopy()
	{
		Student clone = new Student(name, surname);
		return clone;
	}
	
	public int compareTo(String targetKey)
	{
		return(name.compareTo(targetKey));
	}
	
	public void setSurname(String s)
	{
		surname = s;
	}
}
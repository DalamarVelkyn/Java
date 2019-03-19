public class Node 
{

	private String Name;
	private Integer Identification;
	private Double GradeAverage;
	private Node NextNode;
	private Node Node;

	public Node(String name, Integer id, Double gpa) 
	{
		Name = name;
		Identification = id;
		GradeAverage = gpa;
	}

	public String getName() 
	{
		return Name;
	}
	
	public Integer getId()
	{
		return Identification;
	}
	
	public Double getGpa()
	{
		return GradeAverage;
	}

	public Node getNextNode() 
	{
		return NextNode; 
	}

	public void setNextNode(Node node) 
	{
		NextNode = node;  
	}
	
	public void setNode(Node node)
	{
		Node = node;
	}
}
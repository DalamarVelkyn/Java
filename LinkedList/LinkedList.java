public class LinkedList {

	private Node root;
	private Node last;
	private int size;
	
	public LinkedList(Node node)  
	{
		root = node;
		last = node;
		size = 1;
	}
	
	public void append(Node node) 
	{
		last.setNextNode(node);
		last = node;
		size++;
	}

	public void insertNodeAtPosition(Node node, int position) 
	{
		if (position == 0) insertNewRoot(node);
		else if (position == size) append(node);
		else insert(node, position);
	}

	private void insertNewRoot(Node node) 
	{
		node.setNextNode(root);
		root = node;
		size++;
	}

	private void insert(Node node, int index) 
	{
		Node targetNode = getNode(index, false);
		node.setNextNode(targetNode.getNextNode());
		targetNode.setNextNode(node);
		size++;
	}
	
	public void print()
	{
		System.out.println("List Size: [" + size + "]");
		getNode(size, true);
	}
	
	public void printSpecific(int position)
	{
		if (position > size)
		{
			System.out.println("Out of Bounds\n");
			return;
		}			
		else getSpecificNode(position, true);		
	}
	
	private Node getNode(int position, boolean shouldPrint)  
	{
		Node walker = root;

		for (int i=1; i<=position; i++) 
		{
			if (shouldPrint) 
			{
				System.out.print(walker.getName() + " " + walker.getId() + " " + walker.getGpa() + "\n");
			}
			walker = walker.getNextNode();
		}

		return walker;
	}
	
	private Node getSpecificNode(int position, boolean shouldPrint)
	{
		Node single = root;
		
		for (int i=1; i<=position; i++) 
		{
			if (i == position && shouldPrint) 
			{
				System.out.print(single.getName() + " " + single.getId() + " " + single.getGpa() + "\n");
			}
			single = single.getNextNode();
		}
		
		return single;
	}
}
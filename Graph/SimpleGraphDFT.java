import java.util.Stack;

class SimpleGraphDFT
{
	Listing2 vertex[];
	int edge[][];
	int max, numberOfVertices;
	
	public SimpleGraphDFT(int n)
	{
		vertex = new Listing2[n];
		edge = new int[n][n];
		max = n;
	}
	
	public void DFT(int firstVertex)
	{
		int v;
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i < numberOfVertices; i++)
		{
			if(vertex[i] != null)
				vertex[i].setPushed(false);
		}
		stack.push(firstVertex);
		vertex[firstVertex].setPushed(true);
		while(!stack.empty())
		{
			v = stack.pop();
			vertex[v].visit();
			for(int column = 0; column < numberOfVertices; column++)
			{
				if(edge[v][column] == 1 && !vertex[column].getPushed())
				{
					stack.push(column);
					vertex[column].setPushed(true);
				}
			}
		}
	}
	
	public boolean insertVertex(int vertexNumber, Listing2 newListing)
	{
		if(vertexNumber >= max)
			return false;
		vertex[vertexNumber] = newListing.deepCopy(); numberOfVertices++;
		return true;
	}
	
	public boolean insertEdge(int fromVertex, int toVertex)
	{
		if(vertex[fromVertex] == null && vertex[toVertex] == null)
			return false;
		edge[fromVertex][toVertex] = 1;
		return true;
	}
	
	public void showVertex(int vertexNumber)
	{
		System.out.println(vertex[vertexNumber]);
	}
	
	public void showEdges(int vertexNumber)
	{
		for(int column = 0; column < numberOfVertices; column++)
		{
			if(edge[vertexNumber][column] == 1)
				System.out.println(vertexNumber + "," + column);
		}
	}
}
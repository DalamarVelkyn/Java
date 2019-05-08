import java.util.Scanner;

class Dijkstra
{
	static final int V = 9;
	int minDistance(int dist[], Boolean sptSet[])
	{
		int min = Integer.MAX_VALUE, min_index = -1;
		
		for(int v = 0; v < V; v++)
			if(sptSet[v] == false && dist[v] <= min)
			{
				min = dist[v];
				min_index = v;
			}
		
		return min_index;
	}
	
	void printSolution(int dist[], int n)
	{
		
		Scanner dij = new Scanner(System.in);
		System.out.println("Insert Vertex # to search for its distance from Source");
		int dijVertex = dij.nextInt();
				
				while(dijVertex >= 9)
		{
			System.out.println("Value not found, enter another #");
			dijVertex = dij.nextInt();
		}
		
		System.out.println("Vertex   Distance from Source");
		System.out.println(dijVertex + " \t " + dist[dijVertex]);
		
		dij.close();
	}
	
	void dijkstra(int graph[][], int src)
	{
		int dist[] = new int[V];
		
		Boolean sptSet[] = new Boolean[V];
		
		for(int i = 0; i < V; i++)
		{
			dist[i] = Integer.MAX_VALUE;
			sptSet[i] = false;
		}
		
		dist[src] = 0;
		
		for(int count = 0; count < V-1; count++)
		{
			int u = minDistance(dist, sptSet);
			sptSet[u] = true;
			
			for(int v = 0; v < V; v++)
				if(!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
					dist[v] = dist[u] + graph[u][v];
		}
		
		printSolution(dist, V);
	}
}
import java.util.Scanner;

public class MainSimpleGraphDFT
{	
	public static void main(String[] args)
	{
		SimpleGraphDFT flyUS = new SimpleGraphDFT(5);
		Listing2 v0 = new Listing2("5");
		Listing2 v1 = new Listing2("9");
		Listing2 v2 = new Listing2("13");
		Listing2 v3 = new Listing2("64");
		Listing2 v4 = new Listing2("97");
		
		flyUS.insertVertex(0, v0);
		flyUS.insertVertex(1, v1);
		flyUS.insertVertex(2, v2);
		flyUS.insertVertex(3, v3);
		flyUS.insertVertex(4, v4);
		
		flyUS.insertEdge(0,1);
		flyUS.insertEdge(0,3);
		flyUS.insertEdge(0,4);
		flyUS.insertEdge(1,0);
		flyUS.insertEdge(1,2);
		flyUS.insertEdge(1,3);
		flyUS.insertEdge(2,1);
		flyUS.insertEdge(3,0);
		flyUS.insertEdge(3,1);
		flyUS.insertEdge(3,4);
		flyUS.insertEdge(4,0);
		flyUS.insertEdge(4,3);
		
		Scanner dft = new Scanner(System.in);
		System.out.println("Insert Vertex # to search for depth first");
		int dftVertex = dft.nextInt();
		
		while(dftVertex >=5)
		{
			System.out.println("Value not found, enter another #");
			dftVertex = dft.nextInt();
		}
		
		flyUS.showVertex(dftVertex);
		
				
		Graph g = new Graph(4);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		
		System.out.println("\nBFT of the graph starting at Vertex 2");
		
		g.BFS(2);
		
		Scanner bft = new Scanner(System.in);
		System.out.println("Insert Vertex # to search for breadth first");
		int adj = bft.nextInt();
		
		while(adj >=4)
		{
			System.out.println("Value not found, enter another #");
			adj = bft.nextInt();
		}
		
		g.show(adj);
		
		int graph[][] = new int[][] {{0, 4, 0, 0, 0, 0, 0, 8, 0},
									{4, 0, 8, 0, 0, 0, 0, 11, 0},
									{0, 8, 0, 7, 0, 4, 0, 0, 2},
									{0, 0, 7, 0, 9, 14, 0, 0, 0},
									{0, 0, 0, 9, 0, 10, 0, 0, 0},
									{0, 0, 4, 14, 10, 0, 2, 0, 0},
									{0, 0, 0, 0, 0, 2, 0, 1, 6},
									{8, 11, 0, 0, 0, 0, 1, 0, 7},
									{0, 0, 2, 0, 0, 0, 6, 7, 0},
									};
									
		Dijkstra t = new Dijkstra();
		
		System.out.println("\nDijkstra's Shortest Path algorithm");
		
		t.dijkstra(graph, 0);
		
		dft.close();
		bft.close();
	}
}
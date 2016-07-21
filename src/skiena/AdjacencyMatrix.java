package skiena;

public class AdjacencyMatrix {
	int n; //number of vertices
	
	int[][] edges;  //edges
	
	public AdjacencyMatrix(int n){
		this.n = n;
		this.edges = new int[n][n];
	}
}

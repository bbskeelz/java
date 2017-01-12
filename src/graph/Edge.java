package graph;

public class Edge<T> {

	Vertex<T> dest;
	int weight;
	
	public Edge(){
	}
	
	public Edge(Vertex<T> dest, int weight){
		this.dest = dest;
		this.weight = weight;
	}
}

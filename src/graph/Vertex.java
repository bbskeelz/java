package graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex<T> {
	T value;
	List<Edge<T>> edges;
	
	public Vertex(){
		edges = new ArrayList<Edge<T>>();
	}
	
	public Vertex(T t){
		this.value = t;
	}
	
	public void addEdge(Edge<T> edge){
		this.edges.add(edge);
	}
	
	public T getValue(){
		return this.value;
	}
}

package graph;

import java.util.HashMap;
import java.util.List;

public class AdjacencyList<T> {
	
	HashMap<T, List<T>> adjacencyList;
	
	public AdjacencyList(){
		this.adjacencyList = new HashMap<>();
	}
	
	public void addToList(T t, List<T> list){
		this.adjacencyList.put(t, list);
	}
}

package dynamicProgramming;

import java.util.HashMap;

import graph.Edge;
import graph.Vertex;

public class ShortestPath {


	public static void Main(String args){
		Vertex<String> a = new Vertex<>("a");
		Vertex<String> b = new Vertex<>("b");
		Vertex<String> c = new Vertex<>("c");
		Vertex<String> d = new Vertex<>("d");
		a.addEdge(new Edge<String>(b, 2));
		a.addEdge(new Edge<String>(d, 3));
		
		b.addEdge(new Edge<String>(c, 4));

		d.addEdge(new Edge<String>(c, 5));
		
		
	}	
	
	static HashMap<String, Integer> memo = new HashMap<>();
}
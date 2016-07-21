package cake;

import java.util.ArrayList;
import java.util.List;

public class Jenga {

	
	char[][] in;
	String[] words;
	
	public List<String> f(){
		List<String> out = new ArrayList<String>();
		return out;
		
	}
	
	public static void main(String[] args) {

		
	}

class Node{
	int x;
	int y;
	char value;
	List<Node> adjList;
	
	public Node(int x, int y, char c){
		this.x = x;
		this.y = y;
		this.value = c;
		adjList = new ArrayList<Node>();
	}
}	
}

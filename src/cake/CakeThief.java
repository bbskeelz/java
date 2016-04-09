package cake;

import java.util.List;
import java.util.ArrayList;

public class CakeThief{
	//unbounded knapsack problem
	
	//return a list of cakes that constitutes the most value, within the weight capacity
	public static List<Cake> f(Cake[] in, int c){
		List<Cake> out = new ArrayList<Cake>();
		int[] wValues = new int[c+1];
		List<List<Cake>> wCakes = new ArrayList<List<Cake>>();
		
		for (int w = 0; w <= c; w++){
			List<Cake> cakes = new ArrayList<Cake>();
			for (Cake cake : in){
				if (cake.weight > w){
					continue;
				}
				if (cake.value + wValues[w-cake.weight] > wValues[w]){
					wValues[w] = wValues[cake.weight] + wValues[w-cake.weight];
					cakes.clear();
					cakes.add(cake);
					cakes.addAll(wCakes.get(w-cake.weight));
				}
			}
			wCakes.add(cakes);
		}
		return wCakes.get(c);
		
	}
	
	public static void main(String[] args){
		
		Cake c1 = new Cake(1, 2);
		Cake c2 = new Cake(1, 3);  //cake of capacity of 1 should return c2
		Cake c3 = new Cake(2, 4);  //cakes of capacity of 2 should return c2,c2;
		Cake c4 = new Cake(2, 5);  //cake of capacity of 3 should return c2, c2, c2
		Cake c5 = new Cake(3, 6);  

		Cake[] in = new Cake[]{c1, c2, c3, c4};	
		
		System.out.println(f(in, 1));
		
	}
}

class Cake{
	
	int weight;
	int value;
	
	public Cake(int weight, int value){
		this.weight = weight;
		this.value = value;
	}

	public String toString(){
		return weight + "+" + value + " ";
	}
	
}

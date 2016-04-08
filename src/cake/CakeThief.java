package cake;

import java.util.List;
import java.util.ArrayList;

public class CakeThief{
	//unbounded knapsack problem
	

	public static List<Cake> f(Cake[] in, int c){
		List<Cake> out = new ArrayList<Cake>();
		List<List<Cake>> vCakes = new ArrayList<List<Cake>>();
		vCakes.add(out); 
		int[] vValues = new int[c+1];
		
		for (int w = 1; w <=c; w++){
			List<Cake> cakes = new ArrayList<Cake>();
			int value = 0;
			for (Cake cake : in){
				if (cake.weight > w) continue;
				else{
					//verify using this cake would increase value;
					if (cake.value + vValues[c-cake.weight] > value){
						value = cake.value;
						cakes.clear(); 
						cakes.addAll(vCakes.get(w-1));
						cakes.add(cake);
					}
				}
			}
			vCakes.add(cakes);
			vValues[w] = value;
			out = cakes;	
		}
		return out;
	}
	
	public static void main(String[] args){
		
		Cake c1 = new Cake(1, 2);
		Cake c2 = new Cake(1, 3);  //cake of capacity of 1 should return c2
		Cake c3 = new Cake(2, 4);  //cakes of capacity of 2 should return c2,c2;
		Cake c4 = new Cake(2, 5);  //cake of capacity of 3 should return c2, c2, c2
		Cake c5 = new Cake(3, 6);  

		Cake[] in = new Cake[]{c1, c2, c3, c4};	
		
		System.out.println(f(in, 2));
		
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

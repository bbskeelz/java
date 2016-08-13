package cake;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CakeThief2 {


	public static List<Cake> f(Cake[] in, int c){
		
		//figure out from 1 -> c, what is the most optimal cake combo
		Map<Integer, List<Cake>> optimalMap = new HashMap<Integer, List<Cake>>();
		
		for (int w = 0; w <= c; w++){
			List<Cake> optimalList = new ArrayList<Cake>();
			int optimalValue = 0;
			for (Cake cake : in){
				if (cake.weight > w) 
					continue;
				else if (cake.weight == w){
					if (cake.value > optimalValue){
						optimalValue = cake.value;
						optimalList.clear();
						optimalList.add(cake);
					}
				}else{
					int c2Val = 0;
					for (Cake c2 : optimalMap.get(w-cake.weight)){
						c2Val += c2.value;
					}
					if (cake.value + c2Val > optimalValue){
						optimalValue = cake.value + c2Val;
						optimalList.clear();
						optimalList.add(cake);
						optimalList.addAll(optimalMap.get(w-cake.weight));
					}
				}
			}
			optimalMap.put(w, optimalList);
		}
		return optimalMap.get(c);
	}
	
	
	public static void main(String[] args) {

		Cake c1 = new Cake(1,2);
		Cake c2 = new Cake(1,3);
		Cake c3 = new Cake(2,6);
		Cake c4 = new Cake(4,13);
		
		System.out.println(f(new Cake[]{c1,c2,c3, c4}, 0));
		
		//f(1) -> c2
		//f(2) -> c2 * 2;
		//f(3) --> c2 * 3;
		//f(4) --> c4
		
	}
}
	

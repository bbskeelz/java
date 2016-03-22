package cake;

import java.util.HashSet;
import java.util.Set;

public class InFlightEntertainment {

	public static boolean f(int[] in, int dur){
		
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < in.length; i++){
			if (set.contains(new Integer(dur - in[i]))){
				return true;
			}else{
				set.add(in[i]);
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {

		int[] in = new int[]{1,2,3,4,5,6,7};
		System.out.println(f(in, 8));
		System.out.println(f(in, 14));
		
		
	}

}

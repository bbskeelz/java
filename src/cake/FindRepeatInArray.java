package cake;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindRepeatInArray {
	
	
	public static void main(String[] args){

		int[] in = new int[]{6,2,6,1,4,5,1};
		
		System.out.println(f(in));  // expecting 1
		System.out.println(f2(in));  // expecting 1

		
	}

	public static int f(int[] in){
		
		Set<Integer> map = new HashSet<>();
				
		//find ANY integer that appears more than once
		
		for (int i = 0; i < in.length; i++){
			if (map.contains(in[i]))
				return in[i];
			else 
				map.add(in[i]);
		}
		return 0;
	}

	public static int f2(int[] in){
		//sort it to get nlgn time, and o(1) space.
		
		Arrays.sort(in);
		
		for (int i = 0; i < in.length;i++){
			
			if (i > 0 && in[i] == in[i-1]){
				return in[i];
			}
			
		}
		
		return 0;
	}

}

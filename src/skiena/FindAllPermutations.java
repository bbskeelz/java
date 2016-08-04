package skiena;

import java.util.ArrayList;
import java.util.List;

public class FindAllPermutations {
	
	public static void main(String[] args){
		
		f(new String[]{"a", "b", "c"});
	}
	
	/*
	 * we will keep an array of integers
	 * the integer and the position it's in the array 
	 * will map the appropriate string in each permutation
	 */
	public static void f(String[] in){
		back_track(new int[in.length], 0, in);
	}
	
	public static void back_track(int[] a, int k, String[] in){
		if (is_a_solution(a, k)){
			process_solution(a, in);
		}else{
			List<Integer> c = construct_candidates(a, k);
			for (int ci : c){
				a[k] = ci; 	
				back_track(a, k+1, in);
			}
		}
	}
	
	public static List<Integer> construct_candidates(int[] a, int k){
		List<Integer> c = new ArrayList<>();
		boolean[] bitmap = new boolean[a.length];
		for (int i = 0; i < k; i++){
			bitmap[a[i]] = true;
		}
		for (int i = 0; i < bitmap.length; i++){
			if (!bitmap[i]){
				c.add(i);
			}
		}
		return c;
	}
	
	public static boolean is_a_solution(int[] a, int k){
		return (k == a.length);
	}
	
	public static void process_solution(int[] a, String[] in){
		for (int i = 0; i < a.length; i++){
			System.out.print(in[a[i]]);
		}
		System.out.println();
	}
}

package skiena.backtracking;

public class FindAllPermutations {

	public static void main(String[] args){
		
		String[] in = new String[]{"1", "2", "3"};
		
		boolean[] a = new boolean[in.length];
		back_track(in, 0, a);
		
	}
	
	public static void back_track(String[] in, int k, boolean[] a){
		if (is_a_solution(in, k))
			process_solution(in, a);
		else{
			boolean[] c = construct_candidates(in, k, a);
			for (boolean ci : c){
				a[k] = ci;
				back_track(in, k+1, a);
			}
		}
	}
	
	public static boolean[] construct_candidates(String[] in, int k, boolean[] a){
		boolean[] c = new boolean[2];  //either true or false;
		return c;
	}
	
	public static boolean is_a_solution(String[] in, int k){
		return k == in.length;
	}
	
	public static void process_solution(String[] in, boolean[] a){
		
		for (int i = 0; i < a.length; i++){
			if (a[i]) System.out.print(in[i]);
		}
		System.out.println();
	}
	
	
}

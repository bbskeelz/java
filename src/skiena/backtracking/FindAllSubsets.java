package skiena.backtracking;

public class FindAllSubsets {

	
	public static void main(String[] args){
		
//		String[] in = new String[]{"1","2","3","d","e"};
		String[] in = new String[]{"1","2","3"};
		
		//assuming duplicates will be treated as unique strings.
		boolean[] a = new boolean[in.length];
		backtrack(a, 0, in);
	}
	
	public static void backtrack(boolean[] a, int k, String[] in){
		if (is_a_solution(in, k)){
			process_solution(in, a);;
		}else{
			boolean[] c = construct_candidates(a, k, in);
			for (boolean ci : c){
				a[k] = ci;
				backtrack(a, k+1, in);
			}
		}
	}
	
	static boolean is_a_solution(String[] in, int k){
		return k == in.length;
	}
	
	static boolean[] construct_candidates(boolean[] a, int k, String[] in){
		boolean[] c = new boolean[2];
		c[0] = true;
		c[1] = false;
		return c;
	}
	
	static void process_solution(String[] in, boolean[] a){
		for (int i = 0; i< a.length;i++){
			if (a[i])
				System.out.print(in[i]);
		}
		System.out.println();
	}
}

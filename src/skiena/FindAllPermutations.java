package skiena;

public class FindAllPermutations {

	String[] in;
	
	public static void main(String[] args) {

		FindAllPermutations fap = new FindAllPermutations();
		
		fap.in = new String[]{"1","2","3"};
		
		fap.backtrack(new boolean[in.length], 0);
		
	}
	
	void backtrack(boolean[] a, int k){
		if (is_a_solution(a , k)){
			process_solution(a);
		}else{
			String[] c = construct_candidates(a, k);
			backtrack(a, k+1);
		}
	}
	
	boolean is_a_solution(boolean[] a, int k){
		return k == a.length;
	}

	void process_solution(boolean[] a){
		for (int i = 0; i < a.length; i++){
			if (a[i]){
				System.out.print(in[i]);
			}
		}
		System.out.println();
	}
	
}

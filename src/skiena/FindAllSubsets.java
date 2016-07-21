package skiena;

public class FindAllSubsets {

	/*
	 * for an input of size 'n', there are 2 to the n'th power subsets
	 * n = 1; 2 
	 * n = 2; 4
	 * n = 3; 8
	 * ...
	 * 
	 * 
	 *
	 */
	
	boolean isSolution(boolean[] a, int k){
		return (k == a.length);
	}
	
	void backTrack(boolean[] a, int k){
		if (isSolution(a, k)){
			processSolution(a);
		}else{
			boolean[] candidates = construct_candidates();
			for (boolean c : candidates){
				a[k] = c;
				backTrack(a, k+1);
			}
		}
	}
	
	void processSolution(boolean[] a){
		for (int i = 0; i < a.length; i++){
			if (a[i]){
				System.out.print(i+1);
			}
		}
		System.out.println();
	}
	
	boolean[] construct_candidates(){
		return new boolean[]{true, false};
	}

	public static void main(String[] args){
		FindAllSubsets fas = new FindAllSubsets();
		fas.backTrack(new boolean[3], 0);
	}
	
}

package cake;

public class FindRepeatInArray {
	
	
	public static void main(String[] args){

		int[] in = new int[]{6,2,3,1,4,5,1};
		
		System.out.println(f(in));  // expecting 1
		
	}

	public static int f(int[] in){
		
		boolean[] map = new boolean[in.length];
		
		//find ANY integer that appears more than once
		
		for (int i = 0; i < in.length; i++){
			if (map[in[i]]) 
				return in[i];
			else 
				map[in[i]] = true;
		}
		return 0;
		
		
	}
}

package skiena;

public class BinarySearch2 {

	/*
	 * using two indexes, compare the mid to target, assuming array is sorted.
	 */
	public static int f(int[] in, int x){
		int l = 0;
		int r = in.length-1;
		while (l <= r){
			int mid = l + (r - l)/2;
			if (in[mid] == x){
				return mid;
			}else if(in[mid] < x){
				l = mid+1;
			}else{
				r = mid-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] in = new int[]{1,2,3,4,5};
		System.out.println(f(in, 3));
		System.out.println(f(in, 1));
		System.out.println(f(in, 5));
		
		
		
	}

}

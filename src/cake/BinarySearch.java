	package cake;
public class BinarySearch{

	public static int f(int[] in, int x){
		int l  = 0;
		int r = in.length -1;
		
		while (l <= r){
			int div = l + ((r-l)/2);
			if (in[div] == x){
				return div;
			}
			if (in[div] < x){
				l = div + 1;
			}else{
				r = div -1;
			}
		}
		return -1;
	}

	public static void main(String[] args){
		int[] in = new int[]{1,2,3,4,5};
		System.out.println(f(in, 5));
		System.out.println(f(in, -1));
	}

}
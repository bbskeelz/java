package cake;

public class BinarySearch2{

	public static int f(int[] in, int i){
	
		int l = 0;
		int r = in.length -1;
		int mid;
		
		while (l <= r){
			mid = l + ((r - l)/2);
			if (in[mid] == i) return mid;
			if (in[mid] < i){
				l = mid + 1;
			}else{
				r = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args){
	
		int[] in = new int[]{1,2,3};
		System.out.println(f(in, 3));  //2;
		System.out.println(f(in, 4)); //-1;
		in = new int[]{1};
		System.out.println(f(in, 1)); //0
		System.out.println(f(in, 2)); //-1
		in = new int[]{1,2,3,4};
		System.out.println(f(in, 3)); //2
		
		
		
		
	
	}

}
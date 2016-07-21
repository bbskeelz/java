package cake;

public class BinarySearch3 {

	public static int binarySearch(int[] in, int i){
		//we will assume the array is sorted as a pre-condition.
		int lPtr = 0;
		int rPtr = in.length -1;
		
		while (rPtr >= lPtr){
			int mid = (rPtr - lPtr) / 2 + lPtr;
			if (in[mid] == i) 
				return mid;
			if (in[mid] < i){
				lPtr = mid + 1;
			}else{
				rPtr = mid -1;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {

		int[] in1 = new int[]{1};
		int[] in2 = new int[]{1,2};
		int[] in3 = new int[]{};
		int[] in4 = new int[]{1,2,3,4,5};
		
		System.out.println(binarySearch(in1, 1));
		System.out.println(binarySearch(in1, 2));
		System.out.println(binarySearch(in2, 1));
		System.out.println(binarySearch(in3, 2));
		System.out.println(binarySearch(in4, 3));

	}

}

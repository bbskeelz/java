package skiena;

public class SumOfFirstNIntegers{

	public static int f2(int n){
		
		int sum = 1;
		for (int i = 2; i <= n; i++){
			sum = sum + i;
		}
		return sum;
		
	}

	public static int f(int n){
		//1, 2, 9, 10
		if (n == 1) 
			return 1;
		int sum = 0;
		boolean odd = (n % 2 == 1);
		int mid = n / 2;
		if (odd) 
			mid++;
		for (int i = 1; i <= mid; i++){
			//general case:
			if (i == mid){
				if (odd){
					sum = sum + mid;
					continue;
				}
			}
			sum = sum + i + n - i + 1;			
		}
		return sum;
	}

	public static void main(String[] args){
			
		System.out.println(f2(1));  //1
		System.out.println(f2(10)); //55
		System.out.println(f2(9));  //45
		System.out.println(f2(2));
		System.out.println(f2(9));
		System.out.println(f2(10));
		
	}

}

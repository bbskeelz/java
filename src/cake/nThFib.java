package cake;
import java.util.HashMap;

public class nThFib{

	public static HashMap<Integer, Integer> map = new HashMap<>();

	public static int f1(int n){
	
		if (n == 0) return 0;
		if (n == 1) return 1;
		Integer r = map.get(n);
		if ((r == null) || (r == 0)){
			map.put(n , f(n-1) + f(n-2));
		}else{
			return r;
		}
		return map.get(n);
	}

	public static int f(int n){
		if (n <= 1)
			return n;
		else
			return f(n-1) + f(n-2);
	}

	public static void main(String[] args){
	
		int n = 0;
		System.out.println(f(n));
		n = 1;
		System.out.println(f(n));
		n = 2;
		System.out.println(f(n));
		n = 6;
		System.out.println(f(n));
		n = 5;
		System.out.println(f(n));
		n = 7;
		System.out.println(f(n));

	}
}
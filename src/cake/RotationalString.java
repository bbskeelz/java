public class RotationalString{
	
	public static int f(String[] in){
		int l = 0;
		int r = in.length - 1;
		if (in[l].compareTo(in[r]) < 0){
			//if the entire string is already sorted, return 0;
			return l;
		}
		while (l < r){
			int div = l + ((r - l)/2);
			if (in[div].compareTo(in[l]) > 0){
				//at div, string has not rotated  yet
				l = div;
			}else{
				r = div;
			}
			if (l + 1 == r){
				return r;
			}
		}
		return l;
	}
	
	public static void main(String[] args){
		
		String[] in = new String[]{"a", "b", "c", "d", "e", "w", "x", "y", "z"};
		System.out.println(f(in));
		in = new String[]{"x", "y", "z", "a", "b", "c", "d"};
		System.out.println(f(in));
		
	}
	
}

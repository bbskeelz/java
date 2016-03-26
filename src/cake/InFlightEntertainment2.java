package cake;

public class InFlightEntertainment2{
	
	public static boolean f(int[] in, int duration){
		return f(in, 0, duration);
	}
	
	public static boolean f(int[] in, int index, int duration){
		for (int i =index ; i < in.length; i++){
			if (in[i] == duration) return true;
			if (in[i] > duration) continue;
			if (in[i] < duration){
				if (f(in, i+1, duration - in[i]))
					return true;
				continue;
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		
		int[] in = new int[]{3,2,1,4,5};
		System.out.println(f(in, 3));  //line 9
		System.out.println(f(in, 6));  //true
		in = new int[]{7,2,1};
		System.out.println(f(in, 10)); //true
 		System.out.println(f(in, 4));  //10
		in = new int[]{2};
 		System.out.println(f(in, 4));  //10
		
	}
}
package cake;

public class LongestMutualString {

	public static String f(String a, String b){
		return b;
		
	}
	
	public static void main(String[] args) {
		String[] in = new String[]{"a", "a"};  //return a;
		System.out.println(f(in[0], in[1]));
		in = new String[]{"abcabcd", "abcdefg"};
		System.out.println(f(in[0], in[1]));
	}

}

package skiena;

import java.util.*;

public class InsertionSort{

	public static void f(int[] in){

		if (in.length <= 1) return;
		
		for (int i =1; i < in.length; i++){
			int j = i;
			while (j > 0){
				if (in[j] < in[j-1]){
					swap(in, j, j-1);
				}
					j--;
			}	
		}
		
		
	}
	
	public static void swap(int[] in, int a, int b){
		int sub = in[a];
		in[a] = in[b];
		in[b] = sub;
	}

	public static void p(int[] in){
		StringBuilder sb = new StringBuilder();
		for (int i : in){
			sb.append(i).append(",");
		}
		System.out.println(sb);
	}
	
	public static void main(String[] args){
		
		int[] in = new int[]{1};
		f(in);
		p(in);
		in = new int[]{1,2};
		f(in);
		p(in);
		in = new int[]{1,1};
		f(in);
		p(in);
		in = new int[]{};
		f(in);
		p(in);
		in = new int[]{9,8,7,6,5,4,3,2,1};
		f(in);
		p(in);
		
		
	}

}
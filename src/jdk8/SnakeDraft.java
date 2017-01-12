package jdk8;

public class SnakeDraft {

	public static void main(String[] args){
		
		f(14);
	}
	
	
	public static void f(int in){
		
		for (int i = 0; i < 20; i++){
			if (i % 2 == 0){
				for (int j = 1; j <= 14; j++){
					System.out.print(i*14+j + ((j==14) ? "" :" "));
				}
			}else{
				for (int j = 14; j >= 1; j--){
					System.out.print(i*14+j + ((j==1) ? "" : " "));
				}
			}
			System.out.println();
		}
		
	}
	
}

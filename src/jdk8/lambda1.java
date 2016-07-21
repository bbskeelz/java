package jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class lambda1 {

	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		System.out.println("Using consumer interface");
		/*
		 * 
		 */
		numbers.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.print(t);
			}
		});
		System.out.println("\n2nd way");
		numbers.forEach((Integer i) -> System.out.print(i));
		System.out.println("\n3rd way");
		numbers.forEach(i -> System.out.print(i));
		System.out.println("\nthis is just crazy");
		numbers.forEach(System.out::print);
	}


	class Obj{
		String name;
		Integer value;
	}

}




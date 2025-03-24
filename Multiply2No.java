package cloverProject.Imp;

import java.util.function.BiFunction;

public class Multiply2No {
	//write a programm to multiply 2 no's. using Functional interface
	public static void main(String[] args) {

		System.out.println(((BiFunction<Integer, Integer, Integer>) (a, b) -> a * b).apply(5, 7));

	}

}

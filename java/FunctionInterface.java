package com.my.functionalProg;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionInterface {
	public static void main(String[] args) {
		int incrementedValue = increment(1);
		System.out.println(incrementedValue);
		System.out.println(incrementByOne.apply(10));
		System.out.println(incrementByOne.apply(multiplyByNumber10(10)));
		System.out.println( numberAddByoneThenMultiply.apply(10, 20)); 
	}
	// Normal Function 1
	static int increment(int number) {
		return number + 1;
	}
	static Function<Integer, Integer> incrementByOne = number -> number + 1;
	
	// Normal Function 2
	static int multiplyByNumber10(int number) {
		return incrementByOne.apply(number) * 10;
	}
	
	static Function<Integer, Integer>  mulitplyByNumber10 = number -> number * 10;
	
	// Normal Function 3
	static int thirdFunction(int a, int b) {
		return a * b;
	}
	static BiFunction<Integer, Integer, Integer> numberAddByoneThenMultiply = (number1, number2) -> number1 * number2;
	
}

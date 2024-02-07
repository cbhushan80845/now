package com.modernjava.functionalInterface;

import java.util.function.Function;

public class Example_FuntionalInterface {
	public static void main(String[] args) {
		Function<Integer, Double> Sqrt = n  -> Math.sqrt(n);
		System.out.println(Sqrt.apply(121));
		
	}

}

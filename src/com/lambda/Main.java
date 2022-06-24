package com.lambda;

import java.io.IOException;
import java.io.OutputStream;
import java.util.function.LongFunction;

import javax.management.RuntimeErrorException;

public class Main {

	public static void main(String[] args) {
		LongFunction<Long> qew = (Long) -> Long * Long;
		System.out.println(qew.apply(7));
		
		Sample sample = (a, b) -> System.out.println(a + b)	;
		Sample sample1 = (a, b) -> {
			System.out.println(a + b + "Updated");
			System.out.println("Another One!");
			};
		sample.printIt("Axel", "Bajan");
		sample1.printIt("Axel", "Bajan");
		sample2 sample3 = () -> System.out.println("QWER");
		sample3.something();
		Sample.printMe();
		sample3 sample4 = (a) -> a * a;
	}
	
	@FunctionalInterface
	public interface Sample {
		void printIt(String text, String text1);
		
		public default void doSomething() {
			System.out.println("I will always Run!");
		}
		
		public static void printMe() {
			System.out.println("Print me");
		}
	}
	
	public interface sample2{
		void something();
		public static void printMe() {
			System.out.println("Print me");
		}
	}
	
	public interface sample3{
		public int something(int a);
		public static void printMe() {
			System.out.println("Print me");
		}
	}

}

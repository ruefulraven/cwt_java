package com.lambda;

import java.util.*;
import java.util.function.*;

public class LambdaTask {
	public static void main(String[] args) {
		int notDouble = 1;
		double doubleNow;
		BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("BiConsumer" + a + " " + b);
		biConsumer.accept("Axel", "Bajan");
		//
		BiFunction<Integer, Integer, String> biFunction = (a, b) -> "Answer: " + a + b;
		System.out.println("BiFunction" + biFunction.apply(1, 2));
		//
		BinaryOperator<Integer> binaryOperator = 
			BinaryOperator.
				minBy(
					(firstInt, secondInt) -> (firstInt > secondInt) ?  1 : ((firstInt == secondInt) ? 0 : -1)
				);
		System.out.println("BiOperator" + binaryOperator.apply(1, 2));
		//
		BiPredicate<Integer, Integer> biPredicate = (a, b) -> {
			return a == b;
		};
		System.out.println("BiPredicate" + biPredicate.test(1, 1));
		//
		BooleanSupplier boolLambda = () -> 1 == 2;
		System.out.println("BooleanSupplier" + boolLambda.getAsBoolean());
		//
		Consumer<String> consumer = (a) -> System.out.println("Hi" + a + " from consumer!");
		consumer.accept("Axel");
		//
		DoubleBinaryOperator doubleBinaryOperator = (a, b) -> a + b;
		System.out.println(doubleBinaryOperator.applyAsDouble(12, 12));
		//
		DoubleConsumer doubleConsumer = (a) -> System.out.println("You have entered: " + a);
		doubleConsumer.accept(23);
		//
		DoubleFunction<Double> doubleFunction = (a) -> a*a;
		System.out.println(doubleFunction.apply(13));
		//
		DoublePredicate doublePredicate = (a) ->{ return a == 2; };
		System.out.println(doublePredicate.test(2));
		//
		DoubleSupplier doubleSupplier = () -> notDouble ;
		System.out.println(doubleSupplier.getAsDouble());
		//
		doubleNow = doubleSupplier.getAsDouble();
		DoubleToIntFunction doubleToIntFunction = (a) -> (int)a ;
		System.out.println(doubleToIntFunction.applyAsInt(doubleNow));
		//
		DoubleToLongFunction doubleToLongFunction = (a) -> (long)a;
		System.out.println(doubleToLongFunction.applyAsLong(doubleNow));
		//
		DoubleUnaryOperator doubleUnaryOperator = (a) -> (long)a;
		System.out.println(doubleUnaryOperator.applyAsDouble(notDouble));
		//
		Function<Integer, Integer> function = (a) -> {return a * notDouble;};
		Function<Double, Double> function1 = SampleClass::addition;
		System.out.println("FUNCTION: " + function1.apply(12.0));
		
		System.out.println(function.apply(12));
		//
		IntBinaryOperator intBinaryOperator = (a, b) -> (int)a + (int)b;
		IntBinaryOperator intBinaryOperator1 = Math::max;
		System.out.println("Max of the two number is: " +  intBinaryOperator1.applyAsInt(5, 2));
		System.out.println(intBinaryOperator.applyAsInt(notDouble, notDouble));
		//
		IntConsumer intConsumer = (a) -> System.out.println("You have inputted: " + a);
		intConsumer.accept(notDouble);
		//
		IntFunction<Integer> intFunction = (a) -> {
			return a + a;
			};
		System.out.println(intFunction.apply(1));
		//
		IntPredicate intPredicate = (a) -> (int)a == a;
		System.out.println(intPredicate.test(1));
		//
		IntSupplier intSupplier = () -> {
			return notDouble;
		};
		System.out.println(intSupplier.getAsInt());
		//
		IntToDoubleFunction intToDoubleFunction = (a) -> {
			return a;
			};
		System.out.println(intToDoubleFunction.applyAsDouble(notDouble));
		//
		IntUnaryOperator intUnaryOperator = (a) -> {
			return a;
		};
		System.out.println(intUnaryOperator.applyAsInt(notDouble));
		//
		LongBinaryOperator longBinaryOperator = (a, b) -> {
				return a * b;
			}; 
		System.out.println(longBinaryOperator.applyAsLong(3, notDouble));
		//
		LongConsumer longConsumer = (a) -> System.out.println(a);
		longConsumer.accept(1);
		//
		LongFunction<Long> longFunction = (a) -> {
				return a;
			};
		System.out.println(longFunction.apply(1));
		//
		LongPredicate longPredicate = (a) -> {
				return a == 1;
			};
		System.out.println(longPredicate.test(1));
		//
		LongSupplier longSupplier = () -> {
				return (long)doubleNow;
			};
		System.out.println(longSupplier.getAsLong());
		//
		LongToDoubleFunction longToDoubleFunction = (a) -> {
				return (long)a;
			};
		System.out.println(longToDoubleFunction.applyAsDouble(notDouble));
		//
		LongToIntFunction longToIntFunction = (a) -> {
			return (int)a;
		};
		System.out.println(longToIntFunction.applyAsInt(2));
		//
		LongUnaryOperator longUnaryOperator = (a) -> {
			return (long)a;
		};
		System.out.println(longUnaryOperator.applyAsLong(notDouble));
		//
		ObjDoubleConsumer<String> objDoubleConsumer = (a, b) -> {
			System.out.println("first value is: " + a);
			System.out.println("second value is: " + b);
		};
		objDoubleConsumer.accept("Axel" , 3);
		//
		ObjIntConsumer<String> objIntConsumer = (a, b) -> {
			System.out.println("first value is: " + a);
			System.out.println("second value is: " + b);
		};
		objIntConsumer.accept("Axel", 4);
		//
		ObjLongConsumer<String> objLongConsumer = (a, b) -> {
			System.out.println("first value is: " + a);
			System.out.println("second value is: " + b);
		};
		objLongConsumer.accept("Axe", 5);
		//
		Predicate<String> predicate = (a) -> {
			return a.length() == 0;
		};
		System.out.println(predicate.test(""));
		//
		Supplier<String> supplier = () -> {
			return (String)"Sample Supplier message";
		};
		System.out.println(supplier.get());
		//
		ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction = (a, b) -> {
			return a + b;
			};
			System.out.println(toDoubleBiFunction.applyAsDouble(1, 2));
		//
		ToIntBiFunction<Integer, Integer> toIntBiFunction = (a, b) -> {return a + b; };
		System.out.println(toIntBiFunction.applyAsInt(1, 2));
		//
		ToLongBiFunction<Long, Integer> toLongBiFunction = (a, b) -> {return a + b; };
		System.out.println(toLongBiFunction.applyAsLong((long)1, 2));
		//
		ToLongFunction<Integer> toLongFunction = (a) -> {return (long)a; }; 
		System.out.println(toLongFunction.applyAsLong(1));
		//
		UnaryOperator<Integer> unaryOperator = (a) -> {return (Integer)a; };
		System.out.println(unaryOperator.apply(1));
		
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Hwe");
		arrayList.add("Hwe");
		arrayList.add("Hwe");
		arrayList.add("Gwe");
		arrayList.add("Hwe");
		arrayList.add("Hwe");
		arrayList.add("Hwe");
		
		arrayList.add("Hwo");
		int i = 0;
		System.out.println(arrayList);
		arrayList.forEach((a) -> {
			if(a.charAt(0) == 'H') {
				System.out.println("hurah");
			}else {
				System.out.println("huruh");
			}
			
		});
		
		arrayList.removeIf(a -> a.charAt(0) == 'H');
		arrayList.removeIf(a -> a.charAt(a.length() -1) == 'e');
		System.out.println(arrayList);
		}
	
	public class SampleClass{
		public static double addition(double num) {
	        return num + num;
	    }
	}
}

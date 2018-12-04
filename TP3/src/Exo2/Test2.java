package Exo2;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test2 {
	public static void main(String[] args) {

		// Question 1.4
		Stream<Integer> streamOfInteger = Arrays.stream(new Integer[]{ 10, 20, 15, 22, 35 });
		System.out.println(Arrays.toString(streamOfInteger.toArray()));
		IntStream intStream = IntStream.range(0, 10);
		Stream<String> newString = intStream.mapToObj(String::valueOf);
		System.out.println(Arrays.toString(newString.toArray()));
				
	}
}

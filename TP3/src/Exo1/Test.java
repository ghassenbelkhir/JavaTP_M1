package Exo1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class Test {

	public static void main(String[] args) {
		// Question 1
		Stream<String> streamOfString = Stream.of("Vive","les","informaticiens");
		System.out.println(Arrays.toString(streamOfString.toArray()));
		// Question 2
		Stream.Builder<String> builder = Stream.builder();
		Stream<String> streamOfString2 = builder.add("Vive").add("les").add("informaticiens").build();
		System.out.println(Arrays.toString(streamOfString2.toArray()));
		// Question 3
		Stream<String> streamOfString3 = new ArrayList<String>(Arrays.asList("Vive","les","informaticiens")).stream();
		System.out.println(Arrays.toString(streamOfString3.toArray()));
		// Question 4
		Stream<Integer> streamOfInteger = Arrays.stream(new Integer[]{ 10, 20, 15, 22, 35 });
		System.out.println(Arrays.toString(streamOfInteger.toArray()));
		// Question 5 
		LongStream streamOfLong = LongStream.generate(()-> System.nanoTime());
		//streamOfLong.forEach(System.out::println);
		// Question 6
		Stream<BigInteger> streamOfBigInteger = Stream.iterate(BigInteger.ZERO,e->e.add(BigInteger.ONE))
				.filter(e->e.mod(new BigInteger("2")).equals(BigInteger.ZERO));
		//streamOfBigInteger.forEach(System.out::println);
		// question 7
		Scanner scanner = new Scanner(System.in);
		String s= "";
		Builder<String> builder2 = Stream.builder();
		while(!s.equals("exit")) {
			s=scanner.nextLine();
			builder2.add(s);
		}
		Stream<String> streamOfWord = builder2.build();
		streamOfWord.forEach(System.out::println);

	}

}

package Exo2;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;
import java.math.BigInteger;


public class Test2 {
	public static void main(String[] args) {

		// Question 1.4
		Stream<Integer> streamOfInteger = Arrays.stream(new Integer[]{ 10, 20, 15, 22, 35 });
		System.out.println(Arrays.toString(streamOfInteger.toArray()));

		// Question 3
		IntStream intStream = IntStream.range(0, 10);
		Stream<String> newString = intStream.mapToObj(String::valueOf);
		System.out.println(Arrays.toString(newString.toArray()));

		// Question 4
		BigInteger bi1 = new BigInteger("4"); 
		//question4(bi1).forEach(System.out::print);
		
		// Question 5
		// Question 1.6
		System.out.println("question 1.6");
		Stream<BigInteger> streamOfBigInteger = Stream.iterate(BigInteger.ZERO,e->e.add(BigInteger.ONE))
				.filter(e->e.mod(new BigInteger("2")).equals(BigInteger.ZERO)).limit(10);
	
		IntStream intStr = streamOfBigInteger.flatMapToInt());
	
		intStr.forEach(e->System.out.print(e+ " , "));
		
	
	}

	public static IntStream question4(BigInteger bI) {

		IntStream.Builder builder = IntStream.builder();

		for(int i =bI.bitLength()-1;i>=0;i--)
		{
			if(bI.testBit(i)) {
				builder.add(1);
			}else {
				builder.add(0);
			}
		}

		return builder.build();

	}

	
}

package Exo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Test {

	public static <U,T> U fold(Collection<T> c, U u, BiFunction<U,T,U> f) {
		for(T t:c) {
			u = f.apply(u,t);
		}
		return u;
	}
	
	public static <U,T> U fold2(Collection<T> c, U u, BiFunction<U,T,U> f,Function<U,U> g) {
		for(T t:c) {
			u = f.apply(u,t);
		}
		return g.apply(u);
	}


	public static void main(String[] args) {
		StringBuilder s;
		// Test Q2
		List<Integer> lofInt = new ArrayList<Integer>(Arrays.asList(1,1,3,8,6,1));
		
		Integer somme=fold(lofInt,0,(e1,e2)->Integer.sum(e1,e2)); // Integer sum=fold(l,0,(e1,e2)->e1+e2);
		System.out.println(somme);
		
		// Test Q3
		List<String> lOfString = new ArrayList<String>(Arrays.asList("Ghassen ","Belkhir ","M1 informatique ","UPEC"));
		String concatenation= fold(lOfString,"",String::concat);
		System.out.println(concatenation);
		
		// Test Q5
		List<Integer> lofInt2 = new ArrayList<Integer>(Arrays.asList(1,1,3,8,6,1));
		
		
	}
}

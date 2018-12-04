package Exo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test	 {


	public static <V> void question1(Map<String,List<V>> map,List<? super V> l) {

		map.forEach((k,v)-> l.addAll(v));
	}

	public static  <V> void toArrayList(Map<String,List<V>> map) {

		map.replaceAll((k,v)->k.startsWith("*")?Collections.unmodifiableList(v):v);

	}
	
	// Écrire une méthode append(String k,V v) qui ajoute v à la liste associée à k ou,
	//si k n’est pas une clef présente, lui associe une liste de longueur 1 contenant v. Cette méthode doit utiliser la méthode compute de l’interface Map.
	
	public static <V> void append(String k,V v, Map<String,List<V>> map) {
		
		map.computeIfPresent(k, (key,value)->{value.add(v);return value;});
		map.computeIfAbsent(k, value->new ArrayList<V>(Arrays.asList(v)));
		
	}



	public static void main(String[] args) {

		Map<String,List<Integer>> mymap= new HashMap<String,List<Integer>>();	
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		l1.add(9);
		l2.add(5);
		mymap.put("A", l1);
		mymap.put("B", l2);
		List<Integer> newl = new ArrayList<Integer>();
		question1(mymap,newl);
		newl.forEach(System.out::println);
	}


}

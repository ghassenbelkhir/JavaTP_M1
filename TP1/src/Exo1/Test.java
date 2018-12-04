package Exo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test {


	static <T> void deletePair(List<T> ls) {
		Iterator <T> it = ls.iterator();
		int i =0;
		while (it.hasNext()) {
			it.next();
			if(i%2==0) {
				it.remove();
			}
			i=i+1;
		}
	}


	static <T> void deleteEmptyCollection(Collection <? extends Collection <T>> collection) {
		Iterator <? extends Collection<T>> it = collection.iterator();
		while(it.hasNext()) {
			Collection <T> collection2=it.next(); 
			if(collection2.isEmpty())
			{
				it.remove();
			}
		}
	}

	static <T> void to_Map(Collection<? extends T> collection, Map<? super T,? super T> myMap){

		for(T element : collection ) {	
			myMap.put(element, element);
		}
	
	}

	static <T> void collectionOfCol_ToCol (Collection <? extends Collection<? extends T>> collectionSource, Collection <? super T> collectionDest) {
		for(Collection <? extends T> element : collectionSource) {
			collectionDest.addAll(element);
			
		}
	}




	static < T extends Comparable <T>, E extends T> void deleteSupOfMax(Collection <? extends T> collection, E max) {
		Iterator<? extends T> it= collection.iterator();
		while (it.hasNext()) {
			T comp;
			comp=it.next();
			if(comp.compareTo(max)==1) {
				it.remove();
			}
		}
	}

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<List<Integer>> listOfList = new ArrayList<List<Integer>>();
		List<Integer> list3 = new ArrayList<Integer>();

		listOfList.add(list1);
		listOfList.add(list2);

		for(int i = 0; i<10; i++) {
			list1.add(i);
			list2.add(i*10);
		}

		/* Delete */
		System.out.println("* * Question 2 * *");
		deleteEmptyCollection(listOfList);
		for (List<Integer> element : listOfList) {
			System.out.print(element);
		}
		System.out.println();
		
		System.out.println("* * Question 3 * *");
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		to_Map(list2,myMap);
		System.out.println(myMap);
		
		System.out.println();
		
		System.out.println("* * Question 4 * *");
		collectionOfCol_ToCol(listOfList,list3);
		for (Integer element : list3) {
			System.out.print(element);
		}

		System.out.println();

		deleteSupOfMax(list3, 2);
		System.out.println("* * Question 5 * *");
		for (Integer element : list3) {
			System.out.print(element);
		}

	}



}

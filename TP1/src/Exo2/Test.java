package Exo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test {



	public static <K,V> Map<V,List<K>> reverseMap(Map<? extends K,? extends V> myMap)
	{
		Map<V,List<K>> NewMap = new HashMap<V,List<K>>();
		for(Entry<? extends K, ? extends V> e : myMap.entrySet())
		{
			V key=e.getValue();
			if(!myMap.containsKey(key))
			{
				List<K> list = new ArrayList<>();
				list.add(e.getKey());
				NewMap.put(key, list);
			}
			else
			{
				NewMap.get(key).add(e.getKey());
			}

		}
		return NewMap;
	}
	
	
	public static <K,V> Map<V,List<K>> reverseMapVue(Map<K,V> myMap)
	{
		MyMap<V,List<K>> NewMap = new MyMap<V,List<K>>(myMap);
		
		for(Entry<K,V> e : myMap.entrySet())
		{
			V key=e.getValue();
			if(!myMap.containsKey(key))
			{
				List<K> list = new ArrayList<>();
				list.add(e.getKey());
				NewMap.put(key, list);
			}
			else
			{
				NewMap.get(key).add(e.getKey());
			}

		}
		return NewMap;
	}
	
	
	public static void main(String[] args) {

	}

}

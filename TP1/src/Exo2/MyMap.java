package Exo2;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public  class MyMap<K,V> extends AbstractMap<K, V> {
	
	

	Map<K, V> map ;
	
	
	public  MyMap(Map<K,V> map) {
		this.map=map;
	}
	
	

	@Override
	public Set<Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<K> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V put(K key, V value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		// TODO Auto-generated method stub
		
	}
	*/
	/*
	public V remove(Object key) {
		
		Iterator<Entry<K, V>> it = map.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<K,V> element = it.next();
			if(element.getValue().equals(key))
			{
				it.remove();
			}
		}
		return super.remove(key);
	}
*/
	/*@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<V> values() {
		// TODO Auto-generated method stub
		return null;
	}*/

}

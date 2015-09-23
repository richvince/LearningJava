/*
Copyright 2010 kiddy
*/
package holding;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("light", "light的信息");
		map.put("weight", "weight的信息");
		map.put("collection", "collection的信息");
		
		Collection<String> collection = map.values();
		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		for(String value : map.values())
			System.out.println(value);
	}

}

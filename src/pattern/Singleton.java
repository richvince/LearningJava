/*
Copyright 2010 kiddy
*/
package pattern;

import java.util.HashMap;
import java.util.Map;

//利用缓存来实现单例模式
public class Singleton {
	private static final String DEFAULT_KEY = "one";
	private static Map<String, Singleton> map = new HashMap<String, Singleton>();
	private static Singleton uniqueInstance = null;
	private String singletonData;
	
	private Singleton() {
		singletonData = "Hello World!";
	}
	
	public static Singleton getInstance() {
		Singleton uniqueInstance = map.get(DEFAULT_KEY);
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
			map.put(DEFAULT_KEY, uniqueInstance);
			return uniqueInstance;
		}
		else
			return uniqueInstance;
	}
	
	public String getSingletonData() {
		return this.singletonData;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getSingletonData());
	}

}

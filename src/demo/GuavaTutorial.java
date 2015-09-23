package demo;

import java.util.List;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;

public class GuavaTutorial {

	public static void main(String[] args) {
		Integer value1 = new Integer(20);
		Integer value2 = new Integer(10);
		
		Optional<Integer> a = Optional.fromNullable(value1);
		Optional<Integer> b = Optional.of(value2);
		
		System.out.println(sum(a, b));
		
		List<String> theseElements = Lists.newArrayList("alpha", "beta", "gamma");
		
		
		
	}
	
	public static Integer sum(Optional<Integer> a, Optional<Integer> b) {
		
		System.out.println("First parameter is present: " + a.isPresent());
		System.out.println("Second parameter is present: " + b.isPresent());
		
		Integer value1 = a.or(new Integer(0));
		Integer value2 = b.get();
		
		return value1 + value2;
	}

}

package innerclasses;


class Processor {
	public String name() {
		return getClass().getSimpleName();
	}
	Object process(Object input) { return input; }
}

class Upcase extends Processor {
	String process(Object input) {
		return ((String)input).toUpperCase();
	}
}

class Downcase extends Processor {
	String process(Object input) {
		return ((String)input).toLowerCase();
	}
}


public class Apply {

	/**
	 * @param args
	 */
	public static void process(Processor p, Object s) {
		System.out.println("Using Processor&" + p.name());
		System.out.println(p.process(s));
	}
	public static String s = "Disagreement with beliefs is by definition incorrect";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process(new Upcase(), s);
		process(new Downcase(), s);
	}

}

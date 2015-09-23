package example;

class A {int i;}
public class VarArgs {

	/**
	 * @param args
	 */
	static void f(Object[] x){
		for (int i = 0; i < x.length; i++)
			System.out.println(x[i]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(new Object[] {
				new Integer(47), new VarArgs(),
				new Float(1.2), new Double(11.11)});
		f(new Object[] {"one", "two", "three"});
		f(new Object[] {new A(), new A(), new A()});
	}

}

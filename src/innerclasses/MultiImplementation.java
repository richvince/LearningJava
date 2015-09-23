package innerclasses;

class D {}
abstract class E {}
class Z extends E {
	D makeD() { return new D(){}; }
}
public class MultiImplementation {

	/**
	 * @param args
	 */
	static void takeD(D d) {}
	static void takeE(E e) {}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z z = new Z();
		takeD(z.makeD());
		takeE(z);
	}

}

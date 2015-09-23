package innerclasses;

public class DotNew {

	/**
	 * @param args
	 */
	public class Inner {}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DotNew dn = new DotNew();
		DotNew.Inner dni = dn.new Inner();
	}

}

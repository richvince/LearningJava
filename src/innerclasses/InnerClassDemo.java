package innerclasses;

public class InnerClassDemo {
	private int var1;
	
	public InnerClassDemo() {
		this.var1 = 12;
	}
	
	public void setVar(int var) {
		var1 = var;
	}
	
	public class InnerImpl {
		public void printPrivateVariable() {
			System.out.println(var1);
		}
	}
}

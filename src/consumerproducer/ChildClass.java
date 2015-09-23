package consumerproducer;

public class ChildClass extends ParentClass {
	public ChildClass() {
		System.out.println("You are in ChildClass Contructor!");
	}
	
	public ChildClass(int a) {
		super(a);
		System.out.println("You are in ChildClass Contructor!");
	}
	
	public static void main(String[] args) {
		ChildClass child = new ChildClass(1);
	}
}

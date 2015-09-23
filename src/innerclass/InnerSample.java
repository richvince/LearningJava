package innerclass;

public class InnerSample {
	public static void main(String[] args) {
		InnerSample.DemoClass dc = new InnerSample().new DemoClass();
		dc.test();
		InnerSample.DemoStaticClass dsc = new InnerSample.DemoStaticClass();
		dsc.test();
	}
	
	class DemoClass {
		void test() {
			System.out.println("You are in DemoInnerClass!");
		}
	}
	static class DemoStaticClass {
		void test() {
			System.out.println("You are in DemoStaticClass!");
		}
	}
}

class DemoClass {
	void test() {
		System.out.println("You are in DemoClass now!");
	}
}

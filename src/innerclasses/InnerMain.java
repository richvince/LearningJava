package innerclasses;

import java.util.ArrayList;
import java.util.Iterator;

import innerclass.InnerClassDemo.InnerImpl;

public class InnerMain {

	static public void main(String[] args) {
		InnerClassDemo demo = new InnerClassDemo();
		InnerClassDemo.InnerImpl obj = demo.new InnerImpl();
		obj.printPrivateVariable();
		demo.setVar(20);
		obj.printPrivateVariable();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		Iterator<Integer> iter = list.iterator();
		System.out.println(iter.next());
		list.add(0, 0);
		System.out.println(iter.next());
	}
}

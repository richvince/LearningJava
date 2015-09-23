/*
Copyright 2010 kiddy
*/
package thead;

public class ThreadPrinter implements Runnable {
	String name;
	Object pre;
	Object self;
	
	public ThreadPrinter(String name, Object pre, Object self) {
		this.name = name;
		this.pre = pre;
		this.self = self;
	}
	
	public void run() {
		int count = 5;
		
		while(count > 0) {
			synchronized(pre) {
				synchronized(self) {
					System.out.println(name);
					count--;
					self.notifyAll();
				}
				try {
					pre.wait();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		
		ThreadPrinter t1 = new ThreadPrinter("A", obj3, obj1);
		ThreadPrinter t2 = new ThreadPrinter("B", obj1, obj2);
		ThreadPrinter t3 = new ThreadPrinter("C", obj2, obj3);
		
		try {
			new Thread(t1).start();
			Thread.sleep(200);
			new Thread(t2).start();
			Thread.sleep(200);
			new Thread(t3).start();
			Thread.sleep(200);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}	
}

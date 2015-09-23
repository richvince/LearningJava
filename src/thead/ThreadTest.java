/*
Copyright 2010 kiddy
 */
package thead;

public class ThreadTest {
	int temp;
	boolean flag = false;

	public static void main(String[] arg) {
		ThreadTest tt = new ThreadTest();
	}

	private synchronized void add() {
		if (flag) {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + "  "
						+ temp++);
			}
			// try {
			// System.out.println("add Lock losted!");
			// Thread.currentThread().wait();
			// } catch (InterruptedException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			System.out.println("add Lock get!");
		}
	}

	private synchronized void remove() {
		if (!flag) {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + "  "
						+ temp--);
			}
			// try {
			// System.out.println(" Remove Lock losted!");
			// Thread.currentThread().wait();
			// } catch (InterruptedException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			System.out.println("Remove Lock get!");
		}
	}

	class MyThread1 implements Runnable {
		MyThread1(){
			
		}
		public void run() {
			add();
		}
	}

	class MyThread2 implements Runnable {
		public void run() {
			remove();
		}
	}
}

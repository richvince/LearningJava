/*
Copyright 2010 kiddy
*/
package thead;

class Num {
	private int x;
	private int y;
	
	public synchronized void increase() {
		this.x++;
		this.y++;
	}
	
	public synchronized void testEqual() {
		System.out.println(x+","+y+":"+(this.x==this.y));
	}
}

public class NumTest implements Runnable {
	private Num num = null;
	private boolean flag = true;
	
	public NumTest(Num num) {
		this.num = num;
	}
	
	public void run() {
		while(flag) {
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				e.printStackTrace();
			}
			num.increase();
			num.testEqual();
		}
	}
	
	public void stopRun() {
		this.flag = false;
	}
	
	public static void main(String[] args) {
		NumTest nt = new NumTest(new Num());
		Thread t1 = new Thread(nt);
		Thread t2 = new Thread(nt);
		Thread t3 = new Thread(nt);
		t1.start();
		t2.start();
		t3.start();
		try {
			Thread.sleep(10000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		nt.stopRun();
	}
}

/*
Copyright 2010 kiddy
*/
package thead;

public class ApplicationTest implements Runnable {
	
	static int count = 10;
	
	public void run() {
		synchronized(ApplicationTest.class) {
			while(count > 0) {
				try {
					Thread.sleep(1000);
				} catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println("Count = " + count);
				count--;
			}
		}
	}
	
	static public void main(String[] args) {
		Thread t1 = new Thread(new ApplicationTest());
		Thread t2 = new Thread(new ApplicationTest());
		Thread t3 = new Thread(new ApplicationTest());
		long startTime = System.currentTimeMillis();
		t1.start();
		t2.start();
		t3.start();
		/*
		try {
			t1.join(1000);
			t2.join(1000);
			t3.join(1000);
		} catch(Exception e) {
			e.printStackTrace();
		}*/
		try {
			Thread.sleep(2000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Running Time is " + (endTime-startTime));
	}
}

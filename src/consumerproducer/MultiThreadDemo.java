package consumerproducer;

public class MultiThreadDemo {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread1();
		System.out.println("Name of t1 is " + t1.getName());
		//t1.setPriority(3);
		Thread t2 = new Thread1();
		System.out.println("Name of t2 is " + t2.getName());
		//t2.setPriority(2);
		Thread t3 = new Thread1();
		System.out.println("Name of t3 is " + t3.getName());
		//t3.setPriority(1);
		t1.start();
		t2.start();
		t3.start();
		System.out.println(Thread.activeCount());
		/*
		synchronized(Thread1.staticCounter) {
			try {
				Thread1.staticCounter.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/
		//System.out.println("A message from main function!");

	}
}

class Thread1 extends Thread {
	public static int staticCounter = 0;
	int localCounter = 0;
	static Object lock = new Object();
	
	public void run() {
		for(int i=0; i < 5; i++) {
			/*
			staticCounter++;
			synchronized(staticCounter) {
				localCounter++;
				System.out.println("Static Counter is "+staticCounter+"\tLocal Counter is "+localCounter);
				if(staticCounter.intValue() == 1) {
					try {
						staticCounter.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				if(staticCounter.intValue() > 1) {
					staticCounter.notify();
					try {
						staticCounter.wait();
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}*/
			synchronized(lock) {
				staticCounter++;	
				localCounter++;
				System.out.println("Thread Name is "+this.getName()+"\t Local Counter is "+localCounter);
				lock.notify();
				if(i != 4) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		}
	}
}

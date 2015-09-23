package concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
	public static void main(String[] args) {
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);
		
		Producer p = new Producer(queue);
		Consumer c = new Consumer(queue);
		
		new Thread(p).start();
		new Thread(c).start();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Producer implements Runnable {
	protected BlockingQueue<String> queue = null;
	
	public Producer(BlockingQueue<String> queue) {
		this.queue = queue;
	}
	
	public void run() {
		try{
			queue.put("1");
			Thread.sleep(1000);
			queue.put("2");
			Thread.sleep(1000);
			queue.put("3");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Consumer implements Runnable {
	protected BlockingQueue<String> queue = null;
	
	public Consumer(BlockingQueue<String> queue){
		this.queue = queue;
	}
	
	public void run() {
		try{
			System.out.println(queue.take());
			System.out.println(queue.take());
			System.out.println(queue.take());
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
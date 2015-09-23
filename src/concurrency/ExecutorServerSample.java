package concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServerSample {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorServer = Executors.newFixedThreadPool(10);
		
		executorServer.execute(new Runnable() {		
			@Override
			public void run() {
				System.out.println("Asynchronous task1");				
			}
		});
		
		Future future = executorServer.submit(new Runnable() {		
			@Override
			public void run() {
				System.out.println("Asynchronous task2");				
			}
		});
		
		future = executorServer.submit(new Callable() {
			public Object call() throws Exception {
				System.out.println("Asynchronous Callable");
				return "Callable Result";
			}
		});
		
		System.out.println("future.get() = " + future.get());
		executorServer.shutdown();
	}
}

/*
Copyright 2010 kiddy
*/
package thead;

public class ThreadExceptionHandler 
	implements Thread.UncaughtExceptionHandler {
	public void uncaughtException(Thread t, Throwable e) {
		// TODO Auto-generated method stub
		System.out.println(t.getName() + ": " + e.getMessage());
	}
}

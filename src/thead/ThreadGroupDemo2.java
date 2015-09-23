/*
Copyright 2010 kiddy
*/
package thead;

public class ThreadGroupDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExceptionHandler handler = 
			new ThreadExceptionHandler();
		ThreadGroup threadGroup1 = new ThreadGroup("group1");
		
		//这是匿名类写法
		Thread thread1 = new Thread(threadGroup1, 
				new Runnable() {
					
					public void run() {
						// TODO Auto-generated method stub
						throw new RuntimeException("测试异常");
					}
				});
		
		//设置异常处理者
		System.out.println(thread1.getThreadGroup().getName());
		System.out.println(thread1.getThreadGroup().getParent().getName());
		thread1.setUncaughtExceptionHandler(handler);
		thread1.start();
	}

}

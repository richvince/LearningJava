/*
Copyright 2010 kiddy
*/
package thead;

public class ThreadA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thread A 执行");
		
		Thread threadB = new Thread(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread B 开始……");
				try {
					for (int i = 0; i < 5; i++) {
						Thread.sleep(1000);
						System.out.println("Thread B 执行……");
					}
					System.out.println("Thread B 即将结束");
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		threadB.start();
		/*
		try {
			// Thread B 加入 Thread B
			threadB.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		*/
		System.out.println("Thread A 执行");
	}

}

/*
Copyright 2010 kiddy
*/
package thead;

public class PersonalInfoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final PersonalInfo personalInfo = new PersonalInfo();
		
		//假设会有两个线程可能更新person对象
		Thread thread1 = new Thread(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				while(true)
					personalInfo.setNameAndID("Justin Lin", "J.L");
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					personalInfo.setNameAndID("Shang Wang", "S.W");
				}
			}
		});
		thread1.start();
		thread2.start();
	}

}

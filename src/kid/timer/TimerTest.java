/*
Copyright 2010 kiddy
*/
package kid.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {

	static public void main(String[] args) {
		Timer timer = new Timer();
		TimerTask task1 = new ScheduledTask();
		TimerTask task2 = new ScheduledTask();
		//set up the first date
		Date date = new Date();
		timer.schedule(task1, date, 2000);
		timer.schedule(task2, date, 2000);
	}
}

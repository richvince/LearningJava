/*
Copyright 2010 kiddy
*/
package kid.timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class ScheduledTask extends TimerTask {
	
	public void run() {
		SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateTime = tempDate.format(new Date());
		System.out.println(dateTime + "\tHello World!");
	}
}

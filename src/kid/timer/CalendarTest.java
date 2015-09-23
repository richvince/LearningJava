/*
Copyright 2010 kiddy
*/
package kid.timer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	static public void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//find next Monday
		/**
		while(calendar.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY)
			calendar.add(Calendar.DAY_OF_WEEK, 1);
		*/
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		calendar.set(Calendar.HOUR_OF_DAY, 7);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		Date date = calendar.getTime();
		System.out.println("The next Monday is " + format.format(date));
//		switch(calendar.get(Calendar.DAY_OF_WEEK)) {
//		case Calendar.SUNDAY:
//			System.out.println("Today is Sunday! Enjou the weekend!");
//		}
	}
}

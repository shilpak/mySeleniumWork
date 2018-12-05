package example;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class testdatemethod {
	
	@Test
	public void dateTest() {
		Date date = new Date();
		Date equivDate2 = new Date(System.currentTimeMillis());

		System.out.println(date.toString());
		System.out.println(equivDate2.toString());
		
		//seven days from todays date
		long oneWeekFromNowTime = date.getTime(); 
		oneWeekFromNowTime = oneWeekFromNowTime + (1000 * 60 * 60 * 24 * 7); 
		Date oneWeekFromNow = new Date(oneWeekFromNowTime); 
		System.out.println(oneWeekFromNow.toString());
		
		Date sameDate = new Date(); 
		sameDate.setTime(date.getTime());
		
		assertThat(date.equals(sameDate), is(true)); 
		assertThat(date.compareTo(sameDate), is(0));
		
		//Type of pattern
		//"MM/dd/yyyy" "01/01/1970" 
		//"MMM/dd/yyy" "Jan/01/1970" 
		//"MMMM/d/yy" "January/1/70"
		
		String pattern = "MM/dd/yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		String date1 = simpleDateFormat.format(new Date());
		
		System.out.println(date1);
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.getTime().getTime());
		System.out.println(System.currentTimeMillis());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

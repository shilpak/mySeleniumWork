package example;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class ArrayCollection {

	@Test
	public void firstArrayExample() throws Exception {

		OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);

		String[] numbers0123 = {"one", "two", "three"};

		for(String num : numbers0123) {
			System.out.println(num);
			
		}
		

		String days = "";
		String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		for(String workday : workdays) {
			days = days + "|" + workday;
		}
		
		String[] weekdays;
		//Arrays.copyOf(arrayToCopy, length); 
		weekdays =Arrays.copyOf(workdays, 7);
		
		assertEquals("Monday", workdays[0]); 
		assertEquals("Friday", workdays[4]);
		assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday",days);
		
		//copyof range
		weekdays = Arrays.copyOfRange(workdays, 2, 5);
		assertEquals(3, weekdays.length);
		
		//Arrays.fill(array, startIndex, endItemCount, value);
		int[] tenItems = {0,0,0,0,0,1,1,1,1,1};
		
		Arrays.fill(tenItems,5,7,2);
		
		assertEquals(0, tenItems[0]); 
		assertEquals(0, tenItems[4]);
		assertEquals(2, tenItems[5]); 
		assertEquals(2, tenItems[6]); 
		
		int[] outOfOrder = {2,4,3,1,5,0};
		Arrays.sort(outOfOrder);
	
	}

}




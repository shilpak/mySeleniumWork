import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.testng.annotations.Test;

public class checkarray {
	@Test
	public void testcollection() {
		ArrayList <String> workdays = new ArrayList<>();
	   
	workdays.add("Monday"); 
	workdays.add("Tuesday");
	workdays.add("Wednesday"); 
	workdays.add("Thursday"); 
	workdays.add("Friday");
	String [] acd = new String[workdays.size()];
	workdays.toArray(acd);
		System.out.println(acd.length);
		
		System.out.println(acd[2].length());
		
	}

}

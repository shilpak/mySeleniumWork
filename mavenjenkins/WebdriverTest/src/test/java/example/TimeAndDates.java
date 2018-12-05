package example;



import org.junit.Test;

public class TimeAndDates {

	@Test
	public void testTimeandDates() {
		long startTime = System.currentTimeMillis();
		
		System.out.println(startTime);
		
		long startTime1 = System.nanoTime();
		
		System.out.println(startTime1);
	}
	
	@Test public void currentTimeMillis(){ 
		long startTime2 = System.currentTimeMillis();
	for(int x=0; x < 10; x++){ 
		System.out.println("Current Time " + System.currentTimeMillis()); 
		}
	long endTime = System.currentTimeMillis();
	System.out.println("Total Time " + (endTime - startTime2));
	}
	
	
}

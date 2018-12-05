package example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class CollectionsIntro {

	@Test
	public void addDays() {

		Collection<String> workdays = new ArrayList<String>();

		workdays.add("Monday");
		workdays.add("Tuesday");
		workdays.add("Wednesday");
		workdays.add("Thursday");
		workdays.add("Friday");

		System.out.println(workdays.size());

		Collection<String> daysOfWeek = new ArrayList<String>();
		daysOfWeek.addAll(workdays);
		System.out.println(daysOfWeek.size());

		assertEquals( workdays.size(), daysOfWeek.size() ); 
		assertTrue( daysOfWeek.containsAll(workdays));

		Collection<String> weekendDays = new ArrayList<String>();
		weekendDays.add("Saturday"); 
		weekendDays.add("Sunday");
		daysOfWeek.addAll(weekendDays);
		System.out.println(daysOfWeek.size());

		daysOfWeek.clear();
		System.out.println(daysOfWeek);

		assertTrue(daysOfWeek.isEmpty());
		assertFalse(daysOfWeek.containsAll(weekendDays) && daysOfWeek.containsAll(workdays));


	}
	@Test
	public void getAnElementAtAnIndex() {

		List<String> days = new ArrayList<String>();

		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");

		//System.out.println(days.get(3));

	}

	@Test 
	public void removeAnElementAtAnIndex(){ 
		List<String> dayrs = new ArrayList<String>();
		dayrs.add("Monday"); 
		dayrs.add("Tuesday"); 
		dayrs.add("Wednesday");

		dayrs.remove(1);
		dayrs.add(1, "Tuesday");
		dayrs.add(2, "Friday"); 
		dayrs.add(3, "Sunday");

		assertEquals(5, dayrs.size());
		assertEquals("Monday", dayrs.get(0));

	}
	
	@Test
	public void addmissingdays() {
		List<String> dayms = new ArrayList<String>(); 
		List<String> missingDays = new ArrayList<String>();
		dayms.add("Monday"); 
		dayms.add("Friday");
		missingDays.add("Tuesday"); 
		missingDays.add("Wednesday"); 
		missingDays.add("Thursday");
		
		dayms.addAll(1, missingDays);
		
		//System.out.println(dayms.indexOf("Tuesday"));
	}

	@Test 
	public void setDoesNotAllowDuplicateElements(){ 
		Set workdays = new HashSet();
	workdays.add("Monday"); 
	workdays.add("Monday"); 
	workdays.add("Monday"); 
	workdays.add("Monday"); 
	workdays.add("Monday");
	
	//Set doesn't allow duplicates
	//System.out.println(workdays.size());
	assertEquals(1, workdays.size());
	}
	
	@Test
	public void hashmapPractice() {
		Map <String, String> map = new HashMap<>();
		
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		System.out.println(map.size());
		
		map.put("key1", "newvalue1");
		System.out.println(map.get("key1"));
		System.out.println(map.get("key4"));
		
		assertTrue(map.containsKey("key1")); 
		assertFalse(map.containsKey("key23"));
		
		assertTrue(map.containsValue("value2"));
		assertFalse(map.containsValue("value23"));
		
		Map<String, String> mapToAdd = new HashMap<>();
		mapToAdd.put("key1", "keyvalue1"); 
		mapToAdd.put("key4", "value4");
		
		map.putAll(mapToAdd);
		System.out.println(map.get("key1"));
		
		Collection<String> values = map.values();
		
		System.out.println(values);
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		Set<Map.Entry<String,String>> entries = map.entrySet();
		System.out.println(entries);
		for(Map.Entry<String,String> entry : entries) {
			
			entry.setValue("Bob");
			
		}
		System.out.println(entries);
	}

}



package example;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Multidimension {

	int [][] multi= {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

	@Test
	public void print2DIntArray(){ 

		for(int[] outer : multi){ 
			if(outer==null){ 
				System.out.print("null"); 
			}
			else{ 
				for(int inner : outer){ 
					System.out.print(inner + ","); 
				} 
			} 
			System.out.println(""); 
		} 
	}

	@Test 
	public void simpleCollectionExample(){ 
		String[] numbers0123Array = {"zero", "one", "two", "three"}; 
		List<String> numbers0123 = Arrays.asList(numbers0123Array);
		for(String numberText : numbers0123){ 

			System.out.println(numberText); 
		}
		assertEquals("zero", numbers0123.get(0)); 
		assertEquals("three", numbers0123.get(3));

		String[] someDays = {"Tuesday","Thursday", "Wednesday","Monday", "Saturday","Sunday", "Friday"};
		List<String> days = Arrays.asList(someDays);

		int count=0; 
		while(!days.get(count).equals("Wednesday") ){ 
			count++; 
		} 
		assertEquals("Monday is at position 3", 2, count);


		int loopCount; 
		for(loopCount=0; loopCount <= days.size(); loopCount++ ){ 
			if(days.get(loopCount).equals("Tuesday")){ 
				break; 
			} 
		} 
		assertEquals("Tuesday is at position 0", 0, loopCount);


		int forcount = 0;		
		for (String day : days) {
			if(day.equals("Monday")) {
				break;
			}
			forcount++;
		}
		assertEquals("Monday is at position 3",3, forcount);
	}

}	



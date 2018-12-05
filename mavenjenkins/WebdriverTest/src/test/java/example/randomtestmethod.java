package example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import static org.hamcrest.CoreMatchers.allOf;


import java.util.*;

public class randomtestmethod {
	
	@Test
	public void mathrandomTest() {
		
		Random generate = new Random();
		int randomInt = generate.nextInt(5);
		boolean randomBoolean = generate.nextBoolean();
		int randomIntRange = generate.nextInt(12);
		long randomLong = generate.nextLong();
		double randomDouble = generate.nextDouble();
		double randomGaussian = generate.nextGaussian();
		byte[] bytes = new byte[generate.nextInt(100)];
		generate.nextBytes(bytes); 
				
		
/*		System.out.println(bytes);
		System.out.println(randomGaussian);
		System.out.println(randomDouble);
		System.out.println(randomLong);	
		System.out.println(randomIntRange);
		System.out.println(randomBoolean);
		System.out.println(randomInt);*/
		
		int minValue = 15; 
		int maxValue = 20; 						
		int randomIntRange1 = generate.nextInt((maxValue - minValue + 1) + minValue);
		System.out.println(randomIntRange1);
		
		assertTrue("test random high value", maxValue >= randomIntRange1);
		assertTrue("test random low value", minValue <= randomIntRange1);
		
	}
}

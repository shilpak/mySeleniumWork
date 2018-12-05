package example;

import org.junit.Test;

import com.javafortesters.domainentities.User;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import static org.junit.Assert.assertThat;
import static org.testng.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.*;

public class mathAndBigDecimal {

	@Test
	public void testBigDecimal() {
		BigDecimal total = new BigDecimal("0.1").add(new BigDecimal("0.73"));

		assertThat(total, is(new BigDecimal("0.83")));
	}

	@Test public void sortedSetCanMaintainSortOrder(){
		SortedSet<String> alphaset = new <String>TreeSet();
		alphaset.add("c"); 
		alphaset.add("d"); 
		alphaset.add("a"); 
		alphaset.add("b"); 
		alphaset.add("a");
		//System.out.println(alphaset.size());
		assertEquals(4, alphaset.size());

		String[] alphas = new String[alphaset.size()]; 
		alphaset.toArray(alphas);
		assertEquals("a", alphas[0]); 
		assertEquals("b", alphas[1]); 
		assertEquals("c", alphas[2]); 
		assertEquals("d", alphas[3]);
	}

	@Test 
	public void canRetrieveFirstFromSortedSet(){ 
		SortedSet<String> alphaset = new <String>TreeSet();
		alphaset.add("c"); 
		assertEquals("c", alphaset.first());
		alphaset.add("d"); 
		assertEquals("c", alphaset.first());
		alphaset.add("b"); 
		assertEquals("b", alphaset.first());
		alphaset.add("a"); 
		assertEquals("a", alphaset.first());

		System.out.println(alphaset);
	}

	@Test 
	public void canRetrieveLastFromSortedSet(){ 
		SortedSet<String> alphaset = new <String>TreeSet();
		alphaset.add("c"); 
		assertEquals("c", alphaset.last());
		alphaset.add("b"); 
		assertEquals("c", alphaset.last());
		alphaset.add("d"); 
		assertEquals("d", alphaset.last());
		alphaset.add("a"); 
		assertEquals("d", alphaset.last());
		System.out.println(alphaset);

		SortedSet<String> subset = alphaset.headSet("c");
		System.out.println(subset);

		//tailSet subsetafter,and including,an element

		SortedSet<String> subset1 = alphaset.tailSet("c");
		System.out.println(subset1);

		SortedSet<String> subset2 = alphaset.subSet("b", "d");
		System.out.println(subset2);
	}

	@Test 
	public void sortedSetWithComparatorForUser(){ 
		User bob = new User("Bob", "pA55Word"); // 11 
		User tiny = new User("TinyTim", "hello"); //12 
		User rich = new User("Richie", "RichieRichieRich"); // 22 
		User sun = new User("sun", "tzu"); // 6 
		User mrBeer = new User("Stafford", "sys");

		SortedSet<User> userSortedList = new TreeSet<User>(new UserComparator());

		userSortedList.add(bob); 
		userSortedList.add(tiny); 
		userSortedList.add(rich); 
		userSortedList.add(sun); 
		userSortedList.add(mrBeer);

		User[] users = new User[userSortedList.size()]; 
		userSortedList.toArray(users);












	}

}

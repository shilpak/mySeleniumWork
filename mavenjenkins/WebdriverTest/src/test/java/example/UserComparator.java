package example;

import java.util.Comparator;

import com.javafortesters.domainentities.User;

public class UserComparator implements Comparator {
	public int compare(Object oUser1, Object oUser2) {
		User user1 = (User)oUser1; 
		User user2 = (User)oUser2;
		int user1Comparator = user1.getPassword().length() + user1.getUsername().length();

		int user2Comparator = user2.getPassword().length() + user2.getUsername().length();
		int val = user1Comparator - user2Comparator;
		if(val==0){ 
			val = user1.getUsername().compareTo(user2.getUsername()); 
		}
		return val;
	}
}


public class finallyConcept {

	public static void main(String[] args) {
		
		test1();

	}
	
	public static void test1() {
		try {
			System.out.println("I am inside test1");
			
		}finally{
			System.out.println("I am inside finally");
		}
	}

}

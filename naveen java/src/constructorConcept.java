
public class constructorConcept {

	// class entity in the form of object

	public constructorConcept() {
		System.out.println("default constructor");
	}

	public constructorConcept(int a) {
		System.out.println("single parameter constructor");
	}

	public constructorConcept(int i, int j) {
		System.out.println("double parameter constructor");
	}

	public static void main(String[] args) {

		constructorConcept obj = new constructorConcept();

		constructorConcept obj1 = new constructorConcept(10);

		constructorConcept obj2 = new constructorConcept(10, 12);

	}
}

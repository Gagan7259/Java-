package practise;

public class simpleC {
	simpleC() {
		this(10);
		System.out.println("Constructer 143");

	}

	simpleC(int i) {
		super();
		System.out.println("Constructer 123");
	}

	public static void main(String[] args) {
		new simpleC();
		// new simpleC(100);
	}
}

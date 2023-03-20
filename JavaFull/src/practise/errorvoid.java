package practise;

public class errorvoid {
	 errorvoid() {
		System.out.println("consr");
	}

	void errorvoid() {
		System.out.println("methods");
	}

	public static void main(String[] args) {
		new errorvoid();
	}
}

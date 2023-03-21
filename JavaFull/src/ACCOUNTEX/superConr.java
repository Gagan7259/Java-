package ACCOUNTEX;

class A {
	A() {
		System.out.println("'A' constructer");
	}
}

class B extends A {
	B() {

		super();
		System.out.println("'B' constructer");

	}
}

public class superConr {
	public static void main(String[] args) {
		B b = new B();
	}
}

package EncaPsulation;

public class SuperKeyWord {
	int a = 100;

	public void display() {
		System.out.println("Class A display");
	}
}

class SuperKeyWord1 extends SuperKeyWord {
	int a = super.a;

	public void display() {
		super.display();
		System.out.println("Class B display");
	}

}

class C {
	public static void main(String[] args) {
		SuperKeyWord1 s = new SuperKeyWord1();
		System.out.println(s.a);
		s.display();
	}
}
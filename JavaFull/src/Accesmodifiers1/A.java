package Accesmodifiers1;

import AccesSpecifiers.B;

public class A {
	public static void main(String[] args) {
		B b = new B();
		b.m1();
		System.out.println(b.score);
	}
}

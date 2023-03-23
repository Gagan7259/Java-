package LanguagePackage;

public class EquallDemo {
	public static void main(String[] args) {
		String s1 = new String("Manoj");
		String s = new String("Manoj");

		String s2 = new String("Teju");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s));
		System.out.println(s1==s);

	}
}

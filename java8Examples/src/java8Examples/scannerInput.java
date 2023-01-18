package java8Examples;

import java.util.Scanner;

public class scannerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		String a;
		float b;
		Scanner n = new Scanner(System.in);

		System.out.println("Enter iur String");
		a = n.nextLine();
		System.out.println("u enter STring is" + a);

		System.out.println("enter ur Integer");
		c=n.nextInt();
		System.out.println("ur enterd integer is"+c);
		
		System.out.println("enter ur float value");
		b=n.nextFloat();
		System.out.println("u entered float values"+b);
		
	}

}

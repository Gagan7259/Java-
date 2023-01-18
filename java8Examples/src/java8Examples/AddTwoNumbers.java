package java8Examples;

import java.util.Scanner;

public class AddTwoNumbers {
	public static void main(String[] args) {
		int x, y, z;
		System.out.println("Enter ur two numbers");
		Scanner n = new Scanner(System.in);

		x = n.nextInt();
		y = n.nextInt();
		z = x + y;
		System.out.println("sum of the two integers" + z);

	}
}

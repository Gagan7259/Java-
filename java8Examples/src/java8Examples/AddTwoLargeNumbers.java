package java8Examples;

import java.math.BigInteger;
import java.util.Scanner;

public class AddTwoLargeNumbers {
	public static void main(String[] args) {
		String Number1, Number2;
		Scanner N = new Scanner(System.in);
		System.out.println("Enter num1 Numbers");
		Number1 = N.nextLine();
		System.out.println("Enter num2 Numbers");
		Number2 = N.nextLine();
		BigInteger first = new BigInteger(Number1);
		BigInteger second = new BigInteger(Number2);
		BigInteger sum;
		sum = first.add(second);
		System.out.println("Result of addition=" + sum);

	}
}

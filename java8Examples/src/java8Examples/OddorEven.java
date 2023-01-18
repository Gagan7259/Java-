package java8Examples;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int x=100;
		int x;
		System.out.println("Enter Ur Number");
		Scanner n = new Scanner(System.in);
		x = n.nextInt();
		if (x % 2 == 0) {
			System.out.println("Given number is even");
		} else {
			System.out.println("Given number odd");
		}
	}

}

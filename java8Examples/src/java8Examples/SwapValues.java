package java8Examples;

import java.util.Scanner;

//SWAP VALUES USING 3RD VARAIABLE



public class SwapValues {
	public static void main(String[] args) {
		int x, y, temp;
		System.out.println("enter X and Y");
		Scanner n = new Scanner(System.in);
		x = n.nextInt();
		y = n.nextInt();
		System.out.println("Before swapping =" + x + "\ny=" + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("after swapping =" + x + "\ny=" + y);

	}
}


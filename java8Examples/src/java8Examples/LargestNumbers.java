package java8Examples;

import java.util.Scanner;

public class LargestNumbers {

	public static void main(String[] args) {
		int x, y, z;
		System.out.println("enter integers");
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		y = s.nextInt();
		z = s.nextInt();
		if(x>y && x>z) {
			System.out.println(x+" is the large number ");
		}
		else if(y>x && y>z) {
			System.out.println(y+"is the largest number");
		}
		else if(z>x && z>y) {
			System.out.println(z+ "is the largest number");
		}
		else {
			System.out.println("don't enter again");
		}
	}

}

package java8Examples;

import java.util.Scanner;

public class Swapavalueswithout3rdvariable {
	public static void main(String[] args) {
		int x, y;
		System.out.println("enter x And y");
		Scanner n = new Scanner(System.in);
		x = n.nextInt();
		y = n.nextInt();
		System.out.println("Before Swapping vales x=" + x + "\n=" + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swapping vales x=" + x + "\n=" + y);

	}
}

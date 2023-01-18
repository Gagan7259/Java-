package java8Examples;

import java.util.Scanner;

public class FaranheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float temparature;

		Scanner n = new Scanner(System.in);
		System.out.println("Enter ur faranheit");
		temparature = n.nextInt();
		temparature = ((temparature - 32) * 5) / 9;
		System.out.println("Temparature in celsius=" + temparature);
	}

}

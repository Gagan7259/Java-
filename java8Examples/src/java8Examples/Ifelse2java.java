package java8Examples;

import java.util.Scanner;

public class Ifelse2java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks, passingmarks;
		passingmarks = 35;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter ur marks obtained");
		marks = n.nextInt();
		if(marks>=passingmarks) {
			System.out.println("yes u passed but not good marks");
		}
		else {
			System.out.println("Sorry u failed");
		}
	}

}

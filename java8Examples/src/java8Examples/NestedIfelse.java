package java8Examples;

import java.util.Scanner;

public class NestedIfelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks, passingmarks;
		passingmarks = 65;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter ur marks");
		marks = n.nextInt();
		if (marks >= passingmarks) {
			if (marks >= 90) {
				System.out.println("Grade A");
			} else if (marks >= 80) {
				System.out.println("Grade B");
			}
			else if (marks >= 70) {
				System.out.println("Grade C");
			}
			else if (marks >= 60) {
				System.out.println("Grade D");
				System.out.println("u passed exam");
			}
			else {System.out.println("Sorry ur Failed");}
			
		}

	}

}

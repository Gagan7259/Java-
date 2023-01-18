package java8Examples;

import java.util.Scanner;

public class FactorialOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, c, fact = 1;
		System.out.println("Enter Your Integer");
		Scanner N=new Scanner(System.in);
		x=N.nextInt();
		if(x<0) {
			System.out.println("Number should be Non-negetive");
		}
		else {
			for(c=1;c<=x;c++)
			fact=fact*c;
			{
				System.out.println("Factorial of "+x+"is=+"+fact);
			}
		}

	}

}

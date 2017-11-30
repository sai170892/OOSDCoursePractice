package chapter1;

import java.util.Scanner;

class AddNumbers {
	public static void main(String args[]) {
		int x =5, y = 3, z, a, b, c;
		System.out.println("Enter two integers to calculate their sum ");
//		Scanner in = new Scanner(System.in);
//		x = in.nextInt();
//		y = in.nextInt();
		z = x + y;
		a = x - y;
		b = x * y;
		c = x / y;
		System.out.println("Sum of entered integers = " + z);
		System.out.println("Diff of entered integers = " + a);
		System.out.println("Mul of entered integers = " + b);
		System.out.println("Div of entered integers = " + c);

	}
}

package classRoomPrograms;

import java.util.Scanner;

public class MultiplicationTableFor {

	public static void main(String[] args) {
		System.out.print("Input the number(Table to be calculated): ");

		int number = new Scanner(System.in).nextInt();
//		Scanner num = new Scanner(System.in);
//		int number = num.nextInt();
		
		
		System.out.print("\n");
		for (int i = 0; i <= 10; i++) {

			System.out.println(number + " X " + i + " = " + number * i);
		}

	}
}

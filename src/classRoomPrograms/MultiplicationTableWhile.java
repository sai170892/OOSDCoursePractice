package classRoomPrograms;

import java.util.Scanner;

public class MultiplicationTableWhile {
	
		public static void main(String[] args) {
			
			Scanner num = new Scanner(System.in);
			System.out.print("Enter the number: ");
			int i = num.nextInt();
			int y=1;
			
			while(y<=10) {
				System.out.println(i*y);
				y++;
			}
		}
	}

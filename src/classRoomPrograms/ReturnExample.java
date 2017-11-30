package classRoomPrograms;

public class ReturnExample {

	public static void main(String[] args) {
		boolean t = true;

		if (!t)
		{
			return; // return to caller
		}
		System.out.println("Before the return.");

		System.out.println("This won't execute.");
	}

}

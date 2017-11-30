package classRoomPrograms;

public class ForIfExample {

	public static void main(String[] args) {
		for(int x=0; x<=10; x++)
		{
			if(x==0) {
				System.out.println("Neither odd nor Even");
			}
			else if(x%2==1) {
				System.out.println(x+ " - Odd");
			}
			else {
				System.out.println(x+ " - Even");
			}
		}
	}
}
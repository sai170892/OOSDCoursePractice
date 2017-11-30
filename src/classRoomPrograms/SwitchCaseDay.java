package classRoomPrograms;

public class SwitchCaseDay {

	public static void main(String[] args) {
		      String day;
			   int week = 5;
    
		      switch (week) {
		         case 1:
		           day = "Sunday";
		           break;
		         case 2:
		           day = "Monday";
			   break;
		         case 3:
		           day = "Tuesday";
		           break;
		         case 4:
		           day = "Wednesday";
		           break;
		         case 5:
		           day = "Thursday";
		         case 6:
		           day = "Friday";
		           break;
		         case 7:
		           day = "Saturday";
		           break;
		         default: 
		           day = "Invalid day";
		           break;
		      }
		      System.out.println(day);
	}

}

package classRoomPrograms;

public class BreakContinueTwo {

	int data=50;  
	  
	 void change(int data1){  
	 data=data1+100;//changes will be in the local variable only  
	 }
	     
	 public static void main(String args[]){  
		 BreakContinueTwo op=new BreakContinueTwo();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(500);  
	   System.out.println("after change "+op.data);
	 }  
	}  


import java.util.Scanner;

//*******************************************************************************
// TimeComp.java	Lab1Ex4		Kip B. 07/09/2020
// A program to convert a number of seconds into corresponding hh:mm:ss form.
//*******************************************************************************

public class TimeComp {

	public static void main(String[] args) {
		
		int Seconds, HOURS = 3600, MINUTES = 60, SECONDS = 1;
		
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter a number of seconds: ");

		Seconds = scan.nextInt();
		
		int result1 = Seconds / HOURS; // Gives the integer of hours
		int result2 = Seconds % HOURS; // Gives remainder of seconds after hour calc.
		int result3 = result2 / MINUTES; // Gives the integer of minutes
		int result4 = result2 % MINUTES; // Gives the remainder of seconds
		
		 	System.out.println("hours: " + result1);
		 	System.out.println("minutes: " + result3);
		 	System.out.println("seconds: " + result4);
		 	

	}

}

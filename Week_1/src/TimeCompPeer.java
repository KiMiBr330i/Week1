import java.util.Scanner;

public class TimeCompPeer {

	public static void main(String[] args) {
		       
	        int seconds;
	        int minutes;
	        int hours;
	       
	        Scanner scan = new Scanner(System.in);
	       
	        System.out.print("Enter seconds: ");
	       
	        seconds = scan.nextInt();
	        hours = seconds/(60*60);
	        minutes = seconds/60 % 60;
	        seconds = seconds % 60;
	       
	        System.out.print(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");      
	    }
	}
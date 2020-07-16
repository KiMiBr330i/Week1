//*************************************************************************************
// AgeGuess.java	Lab1Ex3		Kip B. 07/09/2020
// A program that asks the user to guess the program's age.
//*************************************************************************************

import java.util.Scanner;

public class AgeGuess {

	public static void main(String[] args) {
		
		String name;
		int AgeGuess;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Guess what my name is: ");
		
			name = scan.nextLine();
		
			System.out.println("You guessed that my name is " + name + "? That's way off!");
		
		
		System.out.print("Guess how old I am: ");
		
			AgeGuess = scan.nextInt();
		
			System.out.println("Really? You think I'm " + AgeGuess + "? You're too kind!");

//*************************************************************************************
// How can I put a timed delay between the first response and the second question?
//*************************************************************************************
		
		
		
		
	}

}

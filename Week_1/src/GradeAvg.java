//******************************************************************************************
// GradeAvg.java   --Lab1Ex2--  Author: Kip B. 07/09/2020
// 
// This program calculates the averages of supplied quiz and test scores.
//******************************************************************************************

public class GradeAvg {

	public static void main(String[] args) {
 
		double quizScore1 = 91, quizScore2 = 94, quizScore3 = 97, 
				
				quizScoreAvg = (quizScore1 + quizScore2 + quizScore3) / 3;
		
		System.out.println("The average quiz score is " + quizScoreAvg + "%");
		
	
		double testScore1 = 96, testScore2 = 100, 
				
				testScoreAvg = ((testScore1 + testScore2) / 2);
		
		System.out.println("The average test score is " + testScoreAvg + "%");

//******************************************************************************************
// I realized that I could define all seven doubles in one line, but it was more legible
// and clear to separate them according to score type and average for each.
//******************************************************************************************
	
	}	
}

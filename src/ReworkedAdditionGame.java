import java.util.Scanner;
public class ReworkedAdditionGame {
	public static void main(String[] args) {
		
		//Declare variables
		int score = 0;
		int hardness = 10;
		
		//I played with for loops when
		//we got to rework this problem
		for (int i = 0; i < 4; i ++){
			
		//Generate 2 Random Numbers
		int number1 = (int)(Math.random() * hardness);		
		int number2 = (int)(Math.random() * hardness);
		
		//Correct Answer is:
		int correctAnswer = number1 + number2;
		
		//Prompt User to Add Numbers
		System.out.println
		("What is " + number1 + " + " + number2 + "?");
		System.out.println("Please answer in integers only.");
		
		//Take User Input
		Scanner input = new Scanner(System.in);
		int studentAnswer = input.nextInt();

		//Check Answer
		//If Correct
		if (studentAnswer == correctAnswer){
			//Tell User They Were Right
			System.out.println("Answer was correct!");
			//Award Points
			score += hardness;
			System.out.println("Score is : " + score);
			//Increase Difficulty
			hardness *= 10;	
			System.out.println("Hardness is now : " + hardness);
		}
		//If Incorrect
		else{
			//Tell User They Were Wrong
			System.out.println("Answer was not correct.");
			//Tell User Correct Answer
			System.out.println("The correct answer was: " + correctAnswer);
			//Do Not Award Points
			score += 0;
			//Make Next Question Easier
		if(hardness>10){
				hardness = hardness / 10;
				}
			}
		}		
	}
}
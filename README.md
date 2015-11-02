# Addition Game
This code is my reworked version of our homework 6 assignment. Our task was to use markdown with the project and fix any mistakes that wer previously had. I leared more on for loops from the internet and they made my life a lot easier when redoing this project.

## Code
```java
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
			score = hardness;
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
```

## Console
All these instances were in the console after I ran my code.
```java
What is 8 + 2?
Please answer in integers only.
10
Answer was correct!
Score is : 10
Hardness is now : 100
What is 40 + 87?
Please answer in integers only.
127
Answer was correct!
Score is : 100
Hardness is now : 1000
What is 31 + 425?
Please answer in integers only.
456
Answer was correct!
Score is : 1000
Hardness is now : 10000
What is 621 + 2056?
Please answer in integers only.
2677
Answer was correct!
Score is : 10000
Hardness is now : 100000

What is 6 + 5?
Please answer in integers only.
12
Answer was not correct.
The correct answer was: 11
What is 5 + 5?
Please answer in integers only.
10
Answer was correct!
Score is : 10
Hardness is now : 100
What is 20 + 52?
Please answer in integers only.
72
Answer was correct!
Score is : 100
Hardness is now : 1000
What is 449 + 332?
Please answer in integers only.
781
Answer was correct!
Score is : 1000
Hardness is now : 10000
```

## Summary
I'm really glad that we got a chance to redo this project because I knew mine wasn't right the firs time that I did it. I spent a lot of my time redoing this project trying to understand for loops; once I understood them, my code-writing life got a lot easier.


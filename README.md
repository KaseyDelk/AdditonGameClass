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


What is 1 + 8?
Please answer in integers only.
9
Answer was correct!
Score is : 10
Hardness is now : 100
What is 29 + 68?
Please answer in integers only.
97
Answer was correct!
Score is : 100
Hardness is now : 1000
What is 65 + 580?
Please answer in integers only.
1230
Answer was not correct.
The correct answer was: 645
What is 91 + 52?
Please answer in integers only.
143
Answer was correct!
Score is : 100
Hardness is now : 1000
```
## Commands for github
Everything under bold in this heading was the command that I typed myself. 

**C:\Users\Kasey>d:**

**D:\>cd KLD_CS1_WorkSpace**

**D:\KLD_CS1_WorkSpace>cd ReworkedAdditionGame**

**D:\KLD_CS1_WorkSpace\ReworkedAdditionGame>dir**
 Volume in drive D is KASEY
 Volume Serial Number is 286C-AE8E

 Directory of D:\KLD_CS1_WorkSpace\ReworkedAdditionGame

11/01/2015  07:45 PM    <DIR>          .
11/01/2015  07:45 PM    <DIR>          ..
11/01/2015  07:45 PM               396 .project
11/01/2015  07:45 PM    <DIR>          src
11/01/2015  07:45 PM    <DIR>          bin
11/01/2015  07:45 PM               232 .classpath
               2 File(s)            628 bytes
               4 Dir(s)   7,623,475,200 bytes free

**D:\KLD_CS1_WorkSpace\ReworkedAdditionGame>git config user.name "Kasey Delk"**

**D:\KLD_CS1_WorkSpace\ReworkedAdditionGame>git config user.email. "delkk@student.swosu.edu"
error: key does not contain variable name: user.email.**

**D:\KLD_CS1_WorkSpace\ReworkedAdditionGame>git config user.email "delkk@student.swosu.edu"**

**D:\KLD_CS1_WorkSpace\ReworkedAdditionGame>git status**
fatal: Not a git repository (or any of the parent directories): .git

**D:\KLD_CS1_WorkSpace\ReworkedAdditionGame>git init**
Initialized empty Git repository in D:/KLD_CS1_WorkSpace/ReworkedAdditionGame/.git/

**D:\KLD_CS1_WorkSpace\ReworkedAdditionGame>git add .**

**D:\KLD_CS1_WorkSpace\ReworkedAdditionGame>git commit -m "first commit"**
[master (root-commit) 18a12cd] first commit
 4 files changed, 79 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 bin/ReworkedAdditionGame.class
 create mode 100644 src/ReworkedAdditionGame.java

**D:\KLD_CS1_WorkSpace\ReworkedAdditionGame>git remote add origin https://github.com/KaseyDelk/AdditonGameClass.git**

**D:\KLD_CS1_WorkSpace\ReworkedAdditionGame>git push -u origin master**
**Username for 'https://github.com': KaseyDelk**
**Password for 'https://KaseyDelk@github.com':**
Counting objects: 8, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (8/8), done.
Writing objects: 100% (8/8), 2.32 KiB | 0 bytes/s, done.
Total 8 (delta 0), reused 0 (delta 0)
To https://github.com/KaseyDelk/AdditonGameClass.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.

**D:\KLD_CS1_WorkSpace\ReworkedAdditionGame>git status**
On branch master
Your branch is up-to-date with 'origin/master'.
nothing to commit, working directory clean

**D:\KLD_CS1_WorkSpace\ReworkedAdditionGame>git add .**

**D:\KLD_CS1_WorkSpace\ReworkedAdditionGame>git commit -m "Added read me file to repository on github"**
[master 4f3ef72] Added read me file to repository on github
 1 file changed, 119 insertions(+)
 create mode 100644 README.md

**D:\KLD_CS1_WorkSpace\ReworkedAdditionGame>git push**
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

**Username for 'https://github.com': KaseyDelk**
**Password for 'https://KaseyDelk@github.com':**
Counting objects: 3, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 1.47 KiB | 0 bytes/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/KaseyDelk/AdditonGameClass.git
   18a12cd..4f3ef72  master -> master

D:\KLD_CS1_WorkSpace\ReworkedAdditionGame>

## Summary
I'm really glad that we got a chance to redo this project because I knew mine wasn't right the firs time that I did it. I spent a lot of my time redoing this project trying to understand for loops; once I understood them, my code-writing life got a lot easier.

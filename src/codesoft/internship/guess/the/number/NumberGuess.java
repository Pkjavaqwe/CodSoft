	package codesoft.internship.guess.the.number;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
	     Random num = new Random();
		int numGuess = num.nextInt(101);
		int maxAttempt=1 ;
		int roundsWon;
		public void guessNumber() {
			while(maxAttempt<6) {
				
				Scanner object = new Scanner(System.in);
				System.out.println("you have maximum 20 attempts to guess a number ");
				System.out.println("Enter the number you want to guess");
				
				int guess=object.nextInt();
				
				if(guess<=100) {
                
                
                	guessLogic(guess);
                }
                
				else {
					System.out.println("Number guessed by you should be less than 100");
					//guessLogic(guess);
					//maxAttempt++;
				}
			
			
			
			};
			
		}
					
		
		public void guessLogic(int num1) {
			if(numGuess==num1) {
				System.out.println("congratulations you guessed the right number");
				roundsWon++;
				maxAttempt++;
			}
			else if(numGuess>num1) {
				 maxAttempt++;
				
				 if(maxAttempt>5) {
						System.out.println("maximum Attempt limit reached, please start freshly ");
						System.out.println(maxAttempt);
						
	            }
				 else {
					
					 
					 nextRoundLogic() ;
					 
				 }
				
				
			}
			else {
				maxAttempt++;
				 if(maxAttempt>5) {
						System.out.println("maximum Attempt limit reached, please start freshly ");
						System.out.println(maxAttempt);
						
	            }
				 else {
					 
					 nextRoundLogic() ;
					 
				 }
				
				}
			
		}
		
		public void nextRoundLogic() {
			
			System.out.println("the number you have guessed is too high");
			System.out.println("press 1 to continue");
			System.out.println("press 2 to discontinue");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch(choice) {
			
			case 1:
				guessNumber();
				break;
			case 2:
				System.out.println("Thank you, We hope you enjoyed playing");
				break;
			}	
			
		}
		public static void main(String[] args) {
			
			
			NumberGuess obj =new NumberGuess();
			System.out.println(obj.numGuess);
			obj.guessNumber();
			
			
		}
}

package codeSoftTask;
import java.util.Scanner;
public class NumberGame
{
	public static void main(String[] args) 
	{
        boolean guessedCorrectly = false;
		int randomNumber=(int)(Math.random()*100)+1;
	       Scanner sc=new Scanner(System.in);
	       int numberOfAttempts=0;
	       System.out.println("welcome to the number guessing Game");
	       System.out.println("Guess the number between 1 and 100:");
	    
	       while(!guessedCorrectly && numberOfAttempts < 3)
	       {
	    	 int userGuess=sc.nextInt();
             if(userGuess == randomNumber)
            {
              guessedCorrectly=true;	
            }
             else
             {
             	numberOfAttempts++;
             	if(userGuess > randomNumber)
             	{
             		System.out.println("your guess is too high");
             	}
             	else
             	{
             		System.out.println("your guess is too low");
             	}
             }
           }
	       sc.close();
	        if(guessedCorrectly)
		       {
		    	   System.out.println("Congratulations ! you guessed correctly! the Number was " + randomNumber);
		       }
		       else
		       {
		    	   System.out.println("Sorry,you ran out of the guessed.The correct answer was " + randomNumber);
		       }
	}
}
                     			       
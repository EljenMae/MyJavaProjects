import java.util.Scanner; // input of the numbers
import java.util.Random; //to generate random number

public class NumberGuessingGame {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in); //input number for the integer.
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. You have 5 attempts to guess it.");

        int[] numbers = new int[5]; //declaration of 5 slots only.
        Random rand = new Random(); //calling the random below.
        int secretNumber = rand.nextInt(100)+1; //it generates 1-100 random number. The reason why it was outside because it will generate only once.
        boolean guessed = false; //condition if the 5 atempts didn't get the result.

        //Loop to get 5 attempts
        for (int i = 1; i <= numbers.length; i++) { //array condition where you it start in number 1 instead of 0. Then stop in number 5.
            System.out.println("Attempt " + i + ": Enter your guess:"); //showing the number to inputed.
            numbers[i - 1] = input.nextInt(); //inputing the guessing number

            if (numbers[i - 1] == secretNumber){ // condition if the random number was meet.
                System.out.println("Correct! You guess it in " + i + "tries!");
                guessed = true; //it will not generate the if(!guessed)
                break; //condition was meet then it should stop.
            } else if (numbers[i - 1] < secretNumber){ //condition if the input number is lower than secretnumber.
                System.out.println("Too low! Try again.");
            }else if (numbers[i - 1] > secretNumber){ //condition if the input number is higher than secretnumber.
                System.out.println("Too high! Try again.");
            }
        }//end of for
        if(!guessed) { //if the 5 attempts didn't get the random number
            System.out.println("Game Over! The correct number was " + secretNumber + ".");
            System.out.println("Better luck next time!");
        }
    }
}

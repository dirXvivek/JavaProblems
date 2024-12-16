import java.util.Random;
import java.util.Scanner;

class Game{
    int noOfGuesses = 0;
    int randInt;
    //generating random number
    public Game(){
        //random instance
        Random rand = new Random();
        randInt =rand.nextInt(100);
    }
    //getting the random generated number
    public int compRand(){
        return randInt;
    }
    //taking input from user
    static int takeUserInput(Scanner input){
        System.out.print("Guess the number: ");
        return input.nextInt();
    }
    //comparing humanGuess number to computerGenerated number
    static boolean isCorrectNumber(int humanGuess,int randomInt){
        return humanGuess == randomInt;
    }
//main class
}
public class GuessNumberUsingOops {
    public static void main(String[] args){
        //class instance
        Game gm = new Game();
        //scanner instance
        Scanner input = new Scanner(System.in);
        int randInt = gm.compRand();
        System.out.println("------Choose The Number Between 0 to 100------->");
        //looping
        while(true){
            int takeResult=Game.takeUserInput(input);
            boolean isBool= Game.isCorrectNumber(takeResult,randInt);
            gm.noOfGuesses++;
            if(isBool){
                System.out.println("Congratulation! both choose "+randInt);
                System.out.println("You take "+gm.noOfGuesses+" chance to guess the number");
                break;
            }
            else if(takeResult>randInt){
                System.out.println("ohh, you choose greater number!");
            }
            else{
                System.out.println("ohh, you choose smaller number!");
            }
        }
    }
}

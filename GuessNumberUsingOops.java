import java.util.Random;
import java.util.Scanner;

class Game{
    //attribute for checking number of guess
    int noOfGuesses = 0;
    int randInt;

    //generating random number
    public Game(){
        //random instance
        Random rand = new Random();
//      getRand(rand.nextInt(100));
        randInt =rand.nextInt(100);

    }
    //getter getting the random generated number
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
        //looping
        while(true){
            int takeResult=Game.takeUserInput(input);
            boolean isBool= Game.isCorrectNumber(takeResult,randInt);
            if(isBool){
                System.out.println("Congratulation! both choose "+randInt);
                System.out.println("You take "+gm.noOfGuesses+" chance to complete");
                break;
            }
            else if(takeResult>randInt){
                System.out.println("ohh!! You choose greater number!");
            }
            else if(randInt>takeResult){
                System.out.println("ohh!! you choose smaller number!");
            }
            else{
                System.out.println("Invalid data");
            }
            gm.noOfGuesses++;

        }

    }
}

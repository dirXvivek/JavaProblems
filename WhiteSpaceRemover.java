import java.util.Scanner;
public class WhiteSpaceRemover {
    public static void main(String[] args)
    {
        //scanner object
        Scanner input = new Scanner(System.in);
        //taking input from the user
        System.out.print("Enter something here!! ");
        String whiteSpace = input.nextLine();
        String whiteReplace = whiteSpace.replace(" ","_");
        System.out.println(whiteReplace);
    }
}
